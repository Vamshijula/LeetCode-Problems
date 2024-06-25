//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

//2149. Rearrange Array Elements by Sign


import java.util.*;
public class LeetCode2149 {

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};                   //o/p :- [3, -2, 1, -5, 2, -4]
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans)); 
    }

    public static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int positive = 0;
        int negative = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[positive] = nums[i];
                positive += 2;
            }else{
                ans[negative] = nums[i];
                negative += 2;
            }
        }
        return ans;

    }
    
}
