public class QuickSortPractice {
    public static void main(String[] args) {
        int[] arr = {8,5,9,1,6,7};

        quicksort(arr,0,arr.length-1);


    }

    private static void quicksort(int[] arr, int l, int r) {
        if (l<r){

            int mid = (l+r)/2;

            quicksort(arr,l,mid);
            quicksort(arr,mid+1,r);

            merge(arr,l,mid,r);

        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

    }
}
