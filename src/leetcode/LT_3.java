package leetcode;

import java.util.HashSet;

public class LT_3 {
    public static void main(String[] args) {

    LT_3 obj = new LT_3();
        System.out.println(obj.lengthOfLongestSubstring("abcabcdb"));


    }

    public int lengthOfLongestSubstring(String s) {
        int count =0;
        int res = 0;

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count =0;
                set.clear();
                count=1;
                set.add(s.charAt(i));
            }else{
                set.add(s.charAt(i));
                count++;
            }
        res= Math.max(res,count);
        }

    return res;
    }

}
