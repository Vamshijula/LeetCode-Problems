//https://leetcode.com/problems/longest-common-prefix/description/

//14. Longest Common Prefix


import java.util.Arrays;
public class LeetCode14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] strs){

        StringBuilder result = new StringBuilder();

        //sort the arrays
        Arrays.sort(strs);

        //get the first ans last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        //compare first and last string characters
        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]){
                break;
            }else{
                result.append(first[i]);
            }
        }
        return result.toString();
    }
}
