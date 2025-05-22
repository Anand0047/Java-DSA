import java.util.Arrays;

public class ProductofArrayExceptSelfLT {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] newarr = new int[nums.length];
        Arrays.fill(newarr,1);
        int pre = 1, post = 1;
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = pre;
            pre = nums[i]*pre;
        }
        for (int i =nums.length-1;i>=0;i--){
            newarr[i] = newarr[i]*post;
            post = nums[i]*post;
        }


    }

}
