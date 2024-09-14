//https://leetcode.com/problems/remove-outermost-parentheses/description/

//1021. Remove Outermost Parentheses


public class LeetCode1021{
    public static void main(String[] args) {
        String s = "(()())(())";
        String ans = removeOuterMostParentheses(s);
        System.out.println(ans);
    }
    
    public static String removeOuterMostParentheses(String s){

        StringBuilder result = new StringBuilder();

        int balance = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(balance > 0){
                    result.append(ch);
                }
                balance++;
            }else{
                balance--;
                if(balance > 0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}