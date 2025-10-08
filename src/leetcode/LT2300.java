package leetcode;

import java.util.ArrayList;

public class LT2300 {
    public static void main(String[] args) {

    }

    public int[] successfulPairs(int[] s, int[] p, long success) {


        ArrayList<Integer> res = new ArrayList<>();
        int counter = 0;
        for(int i =0;i<s.length;i++){
            for(int k =0;k<p.length;k++){
                if (s[i]*p[k]>=success) counter++;
            }
            res.add(counter);
            counter =0;
        }
        int[] result = new int[res.size()];
        int i =0;
        for (Integer num : res){
            result[i++] = num;
        }
        return result;
    }

}
