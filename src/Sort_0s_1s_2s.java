public class Sort_0s_1s_2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int len = arr.length;
        int temp = 0;

        for (int i = 0;i<len;i++){
            for (int j =0;j<len-i-1;j++){

                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

//            System.out.print(arr[]);

    }
}
