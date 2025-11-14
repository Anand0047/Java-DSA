package leetcode;

import java.util.HashMap;

public class LT_RomanToInt {
    public static void main(String[] args) {
    LT_RomanToInt aa = new LT_RomanToInt();
        System.out.println( aa.romanToInt("III"));

    }
    public int romanToInt(String s) {
    int result=0;
    HashMap<String, Integer> map = new HashMap<>();

    map.put("I",1);
    map.put("IV",4);
    map.put("V",5);
    map.put("IX",9);
    map.put("X",10);
    map.put("XL",40);
    map.put("L",50);
    map.put("XC",90);
    map.put("C",100);
    map.put("CD",400);
    map.put("D",500);
    map.put("CM",900);
    map.put("M",1000);

    int count=0;
    while(count<s.length()){
        String str = ""+s.charAt(count);
        if((str.equals("I") || str.equals("X") || str.equals("C")) && count!=s.length()-1 && map.containsKey(str+s.charAt(count+1)) ){
            String str1 = ""+s.charAt(count)+s.charAt(count+1);
            result+=map.get(str1);
            count+=2;
        }else{
            result+=map.get(str);
            count++;
        }

    }


    return result ;
    }
}
