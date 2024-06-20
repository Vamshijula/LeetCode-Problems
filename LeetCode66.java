import java.util.*;
public class LeetCode66 {
    
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] plusOne(int[] digits){

        //interate from last index
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
