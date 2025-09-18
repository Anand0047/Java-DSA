package leetcode;

import java.util.*;

public class LT_3SUM {
    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
//        System.out.println(threeSum(nums));
        Scanner sc = new Scanner(System.in);
    }

//    Brute force O(n3)
    public static List<List<Integer>> threeSum5(int[] nums) {
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




    // Optimial solution
    public static List<List<Integer>> threeSum8(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // sort first
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need bigger sum
                } else {
                    right--; // need smaller sum
                }
            }
        }

        return res;
    }




    public static int threeSum(int[] nums , int taregt) {
//        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // sort first
        int n = nums.length;
        int res =0;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;
            int dis = 10000000;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (true) {
//                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                int newdis = taregt - sum;
                if (dis > newdis){
                    dis = newdis;
                    res = sum;
                }
                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need bigger sum
                } else {
                    right--; // need smaller sum
                }
            }
        }

        return res;
    }
}
