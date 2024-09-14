//https://leetcode.com/problems/isomorphic-strings/description/

//205. Isomorphic Strings

import java.util.HashMap;

public class LeetCode205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean ans = isomorphicStrings(s, t);
        System.out.println(ans);
    }

    public static boolean isomorphicStrings(String s,String t){

        //check if both the strings are of same length
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> result = new HashMap<>();

        for(int i=0;i<s.length();i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!result.containsKey(original)){
                if(!result.containsValue(replacement)){
                    result.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char mappedcharacter = result.get(original);
                    if(mappedcharacter != replacement){
                        return false;
                    }                
            }
        }
        return true;
    }
}
