//https://leetcode.com/problems/single-number/description/

public class LeetCode136 {

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = appearedOnce(arr);
        System.out.println(ans);

    }

    //brute force solution
    public static int appearedOnce(int[] arr){

        int n = arr.length;

        for(int i=0;i<n;i++){
            int num = arr[i];
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j] == num){
                    count++;
                }
            }

            if(count == 1){
                return num;
            }
        }
        return -1;
    }

    //optimal approach
    /*public static int appearedOnce(int[] arr){

        int xor1 = 0;

        for(int i=0;i<arr.length;i++){
            xor1 = xor1 ^ arr[i];
        }
        return xor1;
    }*/


    
}
