//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class LeetCode26 {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};        //{1,1,2};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
        
    }

    public static int removeDuplicates(int[] arr){
        int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    
}
