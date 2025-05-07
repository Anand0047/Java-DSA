public class SecondLargest {
    public static void main(String[] args) {
        int[] arr ={8,5,1,9,2,7};
        int max =0 ;
        int sec =0;
        for (int i =0;i< arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }

        for (int i =0;i< arr.length;i++){
            if (sec!=max && sec<arr[i]){
                sec = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sec);
    }
}
