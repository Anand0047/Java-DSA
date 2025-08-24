import java.util.Arrays;

public class strictsortedFor2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        int target;
        System.out.println(Arrays.toString(search(arr, target = 6)));
    }


    static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {

        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};

    }


    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;   //  be  cautious matrix maay  be lenght empty
        if (rows == 1) {
            return binarysearch(matrix, 0, 0, -1, target);

        }
        int row_start = 0;
        int rend = -1;
        int col_mid = col / 2;
        while (row_start < (rend - 1)) {
            int mid = row_start + (rend - row_start) / 2;
            if (matrix[mid][col_mid] == target) {
                return new int[]{mid, col_mid};
            } else if (matrix[mid][col_mid] < target) {
                row_start = mid;

            } else {
                rend = mid;
            }

        }
        if (matrix[row_start][col_mid] == target) {
            return new int[]{row_start, col_mid};
        }
        if (matrix[row_start + 1][col_mid] == target) {
            return new int[]{row_start + 1, col_mid};
        }
        if (target <= matrix[row_start][col_mid - 1]) {
            return binarysearch(matrix, row_start, 0, -1, target);

        }
        //  second
        if (target > matrix[row_start][col_mid + 1] && target > matrix[row_start][col - 1]) {
            return binarysearch(matrix, row_start, col_mid + 1, col - 1, target);
        }
        if (target <= matrix[row_start + 1][col_mid - 1]) {
            return binarysearch(matrix, row_start + 1, 0, col_mid - 1, target);
        } else {
            return binarysearch(matrix, row_start + 1, col_mid + 1, col - 1, target);
        }

    }
}