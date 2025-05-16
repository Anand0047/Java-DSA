import java.util.ArrayList;
import java.util.Arrays;


public class MissingNUmberCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingElement(arr));


    }

    private static ArrayList<Integer> missingElement(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int j =0;j< arr.length;j++) {
            if (arr[j] != j+1) {
                    num.add(j+1);
                }
        }
        return num;
    }
}
