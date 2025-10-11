package leetcode;

import java.util.HashSet;

public class LT3_lengthOfLongestSubstring {
    public static void main(String[] args) {


    }


    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int counter =0;
        int result =0;
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!set.contains(ch)){
                set.add(ch);
                counter++;
            }else {
                counter=0;
                set.clear();
            }

            result = Math.max(result,counter);
        }

        return result;
    }
}
