public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,4,7,9,1};
        int size = arr.length;
        int minIndx =-1;
        int temp =0;
        for (int i =0;i<size-1;i++){
            minIndx =i;
            for (int j =i+1;j<size;j++){
                if (arr[minIndx]>arr[j]){
                    minIndx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
            //------------------------for understanding-----------------
//            for (int n : arr){
//                System.out.print(n + " ");
//            }
//            System.out.println();
            //------------------------for understanding-----------------

        }
        System.out.println("--------------");

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
