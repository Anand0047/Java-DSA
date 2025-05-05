public class bubblesortINgfg {

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,10,16,19};
        int k= 8;
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
            int mid = (left + right )/2;
            if (arr[mid]==k){
                System.out.println(mid);
                return;
            } else if (arr[mid]>k) {
                right = mid-1;
            }else if(arr[mid]<k){
                left = mid+1;
            }
        }
        System.out.println(-1);
    }
}
