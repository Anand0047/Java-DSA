import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNUmberLT {
    public static void main(String[] args) {

        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> n = new ArrayList<>();
        int i =0;
        while(i<nums.length){

            int crtInd = nums[i]-1;
            if (nums[i] != nums[crtInd]){
                int temp = nums[i];
                nums[i] = nums[crtInd];
                nums[crtInd] = temp;
            }else
            {
            i++;
        }}
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                n.add(nums[j]);
            }
        }

        return n;
    }
}