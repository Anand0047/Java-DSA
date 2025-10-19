package leetcode;

public class LT_3_longest_substring {
    public static void main(String[] args) {
        LT_3_longest_substring obj = new LT_3_longest_substring();
        System.out.println(obj.longestPalindrome("babad"));
    }
    public  String longestPalindrome(String s) {

        String result = Character.toString(s.charAt(0));
        int l =0;
        for(int r =0;r<s.length();r++)
        {
            String current = s.substring(l,r);
            while(l!=r){
                if(isPalindrome(current) && current.length()>result.length()){
                    result = current;
                }
                l++;
            }
            l=0;
        }
    return result;
    }


    boolean isPalindrome(String s){
        int l =0;
        int r =s.length()-1;

        while(l<=r){
            if (s.charAt(l)!= s.charAt(r)) return false;
            l++;
            r--;
        }
    return true;
    }
}
