public class MountainArray {
     static void main(String[] args) {
//        int[] mountainArray = {2, 5, 8, 10, 6, 3, 1};
//        int left = 0;
//        int right = mountainArray.length -1;
//        int target = 10;
//
//
//        while(left<right) {
//            int mid = (left + right) / 2;
//            if (mountainArray[mid] == target) {
//                System.out.println(mid);
//                return;
//            } else if (mountainArray[mid] > target) {
//                right = mid + 1;
//            } else if (mountainArray[mid] < target) {
//                left = mid - 1;
//            }
//        }
        }

    public int peakIndexInMountainArray(int[] mountainArray) {

         int start = 0;
         int end = mountainArray.length-1;

         while (start<end){
             int mid = start + (end -start) /2;
             if (mountainArray[mid] > mountainArray[mid+1]){
                 end = mid ;
             }else {
                 start = mid +1;
             }
         }
         return start;
    }

    }

