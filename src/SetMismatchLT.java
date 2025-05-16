import java.util.Arrays;

public class SetMismatchLT {
    public static void main(String[] args) {
        int [] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];

        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if (nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else {
                i++;
            }
        }
        for (int j = 0;j <nums.length;j++){
            if (nums[j] != j+1){
                res[0]=nums[j];
            }
            if (nums[j] != j+1){
                res[1] = j+1;
            }
        }


        return res;
    }
}