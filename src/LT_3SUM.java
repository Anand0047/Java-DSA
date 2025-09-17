import java.util.*;

public class LT_3SUM {
    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }

//    Brute force O(n3)
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> cur = new ArrayList<>();
                        cur.add(nums[i]);
                        cur.add(nums[j]);
                        cur.add(nums[k]);
                        res.add(cur);
                    }
                }
            }
        }
        return res;
    }

}
