package leetcode;

import java.util.*;

public class LT_GroupAnagram {
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if (!map.containsKey(s)) map.put(s, new ArrayList<>());

            map.get(s).add(str);
        }

        return new ArrayList<>(map.values());



    }
}
