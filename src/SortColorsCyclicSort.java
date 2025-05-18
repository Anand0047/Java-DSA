import java.util.Arrays;

public class SortColorsCyclicSort {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        int i =0;
        while(i<nums.length){
            int crt = nums[i];
            if (nums[i] != nums[crt]){
                int temp = nums[i];
                nums[i] = nums[crt];
                nums[crt] = temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
