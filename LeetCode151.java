//https://leetcode.com/problems/reverse-words-in-a-string/description/

//151. Reverse Words in a String


public class LeetCode151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseString(s);
        System.out.println(ans);
    }

    public static String reverseString(String s){

        StringBuilder result = new StringBuilder();

        String[] words = s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
