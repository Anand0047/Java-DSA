import java.util.Arrays;

public class QuickSort {

    public static void quicksortalgo(int[] arr, int low , int high ){
            if (low<high) {
                int pi = partition(arr, 0, high);

                quicksortalgo(arr, low, pi - 1);
                quicksortalgo(arr, pi + 1, high);
            }
    }

    public static int partition(int[] arr,int low , int high){
        int pi = arr[high];
        int i = low - 1;

        for(int j = low;j<high;j++){
            if ( arr[j] < pi ){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp ;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,6,1,3,4,8};
        System.out.println("Before sorting " + Arrays.toString(arr));

        quicksortalgo(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
