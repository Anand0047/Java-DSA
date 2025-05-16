import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr = {3,1,4,5,2};
        System.out.println("Before sorting " + Arrays.toString(arr));
        cyclesort(arr);
        System.out.println("Aftersorting " + Arrays.toString(arr));
    }

        static  void cyclesort( int[] arr){
            int i =0;
                while (i< arr.length){
                    int correctIndex = arr[i]-1;
                    if (arr[i] != arr[correctIndex]){
                        int temp = arr[i];
                        arr[i] = arr[correctIndex];
                        arr[correctIndex] = temp;
                    }else {
                        i++;
                    }
                }
            }

}
