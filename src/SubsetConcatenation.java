//import java.util.*;
//
//public class SubsetsBacktracking {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        List<List<Integer>> result = subsets(nums);
//        System.out.println(result);
//    }
//
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(nums, 0, new ArrayList<>(), result);
//        return result;
//    }
//
//    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
//
//        result.add(new ArrayList<>(current));
//
//        for (int i = start; i < nums.length; i++) {
//            current.add(nums[i]);
//            backtrack(nums, i + 1, current, result);
//            current.remove(current.size() - 1);
//        }
//    }
//}
//




//=================================================================================================================


import java.util.ArrayList;
import java.util.List;

public class SubsetConcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generateSubsets(nums, 0, "");
    }
    static List<Integer> na = new ArrayList<>();

    public static void generateSubsets(int[] nums, int index, String current) {
        if (index == nums.length) {
            if (!current.isEmpty()) { // skip empty subset
                System.out.print(current + " ");
            }
            return;
        }
        // Include current number
        generateSubsets(nums, index + 1, current + nums[index]);

        // Exclude current number
        generateSubsets(nums, index + 1, current);
    }
}
