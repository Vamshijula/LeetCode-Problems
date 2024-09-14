//https://leetcode.com/problems/largest-odd-number-in-string/description/

//1903. Largest Odd Number in String


public class LeetCode1093 {
    public static void main(String[] args) {
        String num = "52";
        String ans = largestOddNumber(num);
        System.out.println(ans);
    }

    public static String largestOddNumber(String num){
        String maxOdd = "";

        for(int i=0;i<num.length();i++){
            if(num.charAt(i) % 2 != 0){
                String currentNumber = num.substring(0, i+1);
                if(currentNumber.compareTo(maxOdd) > 0){
                    maxOdd = currentNumber;
                }
            }
        }
        return maxOdd;
    }
}
