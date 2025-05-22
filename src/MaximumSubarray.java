public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int curMax = 0;
        int max = 0;
        for (int i : arr){
            curMax = Math.max(arr[i],curMax+arr[i]);
            max = Math.max(max,curMax);
        }

    }
}
