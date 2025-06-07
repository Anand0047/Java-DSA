public class SmalledIndexLT {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(smallestIndex(nums));
    }
    static int smallestIndex(int[] nums) {

        for(int i =0;i<nums.length;i++){
            int digit = 0;
            int indexval =0;
            int val = nums[i];
            while(val !=0){
                digit = val%10;
                indexval += digit;
                val/=10;
            }
            if(i == indexval){
                return nums[i];
            }

        }
        return -1;

    }
}
