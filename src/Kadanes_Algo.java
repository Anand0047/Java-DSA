public class Kadanes_Algo {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int max = arr[0];
        int cur =0;
        for(int i : arr){
            cur = Math.max(cur , 0);
            cur += i;
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}
