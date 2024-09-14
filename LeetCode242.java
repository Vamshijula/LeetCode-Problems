//https://leetcode.com/problems/valid-anagram/description/

//242. Valid Anagram


import java.util.Arrays;
public class LeetCode242 {
   public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    boolean ans = validAnagram(s, t);
    System.out.println(ans);
   }
   
   public static boolean validAnagram(String s,String t){

    //check if both the strings are of same length
    if(s.length() != t.length()){
        return false;
    }

    //convert the string into char array
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    //sort the arrays
    Arrays.sort(sArray);
    Arrays.sort(tArray);
    
    //check if sorted arrays are equal

    return Arrays.equals(sArray,tArray);

   }
}
