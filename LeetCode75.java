//https://leetcode.com/problems/sort-colors/description/
//import java.util.*;
public class LeetCode75 {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int n = arr.length;
        sortColors(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortColors(int[] arr,int n){
        //using Dutch National Flag Algorithm

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                //swap
                swap(arr,mid,low);
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                //swap
                swap(arr,mid,high);
                mid++;
                high--;
            }
        }
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
