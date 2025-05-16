import java.util.Arrays;

public class firstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i< nums.length){
            int crtInd = nums[i]-1 ;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[crtInd]){
                int temp = nums[i];
                nums[i] = nums[crtInd];
                nums[crtInd] = temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int j =0;j< nums.length;j++){
            if (nums[j] != j+1){
                return j+1;
            }
        }

        return nums.length;
    }
}