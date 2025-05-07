import java.util.Arrays;

public class Patternprinting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
         System.out.println("before sorted");
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length-1;
        int temmp =0;
        while(left<right){
            temmp = arr[left];
            arr[left] = arr[right];
            arr[right] = temmp;
            left++;
            right--;
        }
        System.out.println("after swapping ");
        System.out.println(Arrays.toString(arr));
    }
}
