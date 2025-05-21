import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOfSubarraySumGFG {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr,target));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(0,6);
        return list;
    }
}




