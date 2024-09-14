import java.util.Arrays;

public class Leetcode31 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] arr){
        int n= arr.length;

        //step1 : Find the pivot
        int i = n-2;
        while(i>=0 && arr[i]>= arr[i+1]){
            i--;
        }

        //if i is -1, the array is in descending order, reverse it to get the smallest permutation
        if(i == -1){
            reverse(arr,0,n-1);
            return;
        }

        //step2 : Find the Successor
        int j = n-1;
        while(arr[j] <= arr[i]){
            j--;
        }

        //step3: swap the pivot with successor
        swap(arr,i,j);

        //step4 : Reverse the suffix
        reverse(arr,i+1,n-1);
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
