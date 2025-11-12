import java.util.Arrays;

public class LT_moveZeros {
    public static void main(String[] args) {
          int[]  nums = {0,0,1};
        System.out.println(Arrays.toString(nums));

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums) {
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            if(nums[l]==0){
                helperFunc(l,r,nums);
            }else{
                l++;
            }
        }
    }

    private static void helperFunc(int l, int r, int[] nums) {
        int pointer = l;
        while(pointer<r){
            int temp = nums[pointer];
            nums[pointer] = nums[pointer+1];
            nums[pointer+1] = temp;
            pointer++;
        }

    }
}
