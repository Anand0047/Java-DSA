import java.util.Arrays;

public class Move_0sToLast {
    public static void main(String[] args) {
        int []  arr = {2,1,0,4,0,3,0,0,3};

        int j = 0; // pointer for placing non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++; // move j to next position
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
