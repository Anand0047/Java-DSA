package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LT_TwoSum {
    public static void main(String[] args) {

        ArrayList<int[]> res = new ArrayList<>();


    }

    int sample(int samp){
        Integer res = 0;
        return res;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (map.containsKey(sum)) {
                return new int[]{map.get(sum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
