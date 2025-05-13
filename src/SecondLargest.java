public class SecondLargest {
    public static void main(String[] args) {
        int[] arr ={12,5,12};
        int FirstMax =arr[0] ;
        int SecondMax =arr[1];

        for (int i= 2;i<arr.length;i++){
            if (arr[i]>FirstMax){
                SecondMax = FirstMax;
                FirstMax = arr[i];
            } else if (arr[i] >SecondMax) {
                SecondMax = arr[i];
            }
        }
        System.out.println(SecondMax);
    }
}
