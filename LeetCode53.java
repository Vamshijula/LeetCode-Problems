public class LeetCode53 {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
        
    }

    public static int maxSubArray(int[] nums){
        int sum = 0;
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];

            if(sum < 0){
                sum = 0;
            }

            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
    
}
