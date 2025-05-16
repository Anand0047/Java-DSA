import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUMTWOEQUALS0 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<Integer>();

        int i=0;
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if (arr[left] + arr[right] ==0){
                list.add(arr[left]);
                list.add(arr[right]);
            } else if (arr[left] + arr[right] >0) {
                right--;
            }else if (arr[left] +arr[right] <0){
            left++;
            }
            i++;
        }
        System.out.println(list);
    }
}
