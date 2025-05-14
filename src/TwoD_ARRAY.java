import java.util.Arrays;
import java.util.Scanner;

public class TwoD_ARRAY {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0;row<arr.length;row++){
                for (int col = 0;col<arr[row].length;col++){
                    arr[row][col] = sc.nextInt();
                }
            }
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
