import java.util.*;
public class LeetCode1 {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        //int[] arr = {3,2,4};
        //int target = 6;
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] twoSum(int[] arr,int target){
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }

    //brute Force solution
    /*public static int[] twoSum(int[] arr,int target){
       int[] ans = new int[2];
       ans[0] = -1;
       ans[1] = -2;
       
       for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }*/
}
