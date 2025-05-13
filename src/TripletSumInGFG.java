public class TripletSumInGFG {

    public static void main(String[] args) {
        System.out.println(Triplesum());
    }
    public static boolean Triplesum() {
       int arr[] = {1, 4, 45, 6, 10, 8};
       int target = 13;

       for (int i =0;i< arr.length-2;i++){
           int left = i+1;
           int right = arr.length-1;

           while (left<right){
                int sum = arr[i]+arr[left]+arr[right];
               if (sum == target){
                   return true;
               }else if (sum<target){
                   left++;
               } else if (sum>target) {
                   right++;
               }
           }
       }
    return false;
    }
}
