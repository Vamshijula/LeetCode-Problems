//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class LeetCode1752 {

    public static void main(String[] args) {
        
        int[] arr = {3,4,5,1,2};
        boolean ans = isSorted(arr);
        System.out.println(ans);


    }

    public static boolean isSorted(int[] nums){

        int k = 0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                k++;
            }

            if(k>1){
                return false;
            }
        }
        return true;
    }
    
}
