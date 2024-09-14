//https://leetcode.com/problems/rotate-string/description/

//796. Rotate String


public class LeetCode796 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cdeab";
        boolean ans = rotateString(s, t);
        System.out.println(ans);
    }

    public static boolean rotateString(String s,String t){

        //check if both the sstrings are of same length
        if(s.length() != t.length()){
            return false;
        }

        //Concate s with itself and chech whether t exists
        String concatenated = s + s;
        return concatenated.contains(t);
    }
}
