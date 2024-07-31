//https://leetcode.com/problems/max-consecutive-ones/description/

public class LeetCode485 {
    
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int ans = maxCount(arr);
        System.out.println(ans);

    }

    public static int maxCount(int[] arr){

        int count = 0;
        int max = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] == 1){
                count++;
            }else{
                count = 0;
            }

            max = Math.max(count,max);
        }
        return max;
    }
}
