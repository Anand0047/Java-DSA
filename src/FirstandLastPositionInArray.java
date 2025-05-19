import java.util.Arrays;

public class FirstandLastPositionInArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
//        System.out.println(Arrays.toString(        searchRange(nums,8)));
    }
    public  int[] searchRange(int[] nums, int target) {
        int [] ans = {0,0};
        int start = searching(nums,target,true);
        int end = searching(nums, target, false);
        ans[0] = start;
        ans [1] = end ;

        return ans;

    }
     int searching(int[] arr, int target , boolean FindFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start ) /2;
        while(start<=end){
            if (arr[mid] >target){
                end = mid -1;
             } else if(arr[mid] < target){
                start = mid +1;
            }else {
                ans = mid ;
                if (FindFirstIndex){
                    end = mid -1;
                }else {
                    start= mid +1;
                }
            }
        }
        return ans;
    }
}