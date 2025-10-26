package leetcode;
import java.util.Arrays;

public class LT_MaximumAlternatingSumOfSquares {
    public static void main(String[] args) {
        int[] num = {1, -1, 2, -2, 3, -3};
        System.out.println(maxAlternatingSumOfSquares(num)); // Output: 16
    }
//======================================== WRONG SOLUTION =========================================================
    public static long maxAlternatingSumOfSquares(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];

        // Step 1: Square all numbers
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        // Step 2: Sort the squared values
        Arrays.sort(squares);

        // Step 3: Alternate add/subtract starting from largest
        long score = 0;
        boolean add = true;

        for (int i = 0; i < n; i++) {
            if (add)
                score += squares[n-1-i];
            else
                score -= squares[i];
            add = !add; // flip sign each time
        }

        return score;
    }

}
