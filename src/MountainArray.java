public class MountainArray {
    public static void main(String[] args) {
        int[] mountainArray = {2, 5, 8, 10, 6, 3, 1};
        int left = 0;
        int right = mountainArray.length -1;
        int target = 10;
        int num = 3/2;
        System.out.println(num);

        while(left<right) {
            int mid = (left + right) / 2;
            if (mountainArray[mid] == target) {
                System.out.println(mid);
            } else if (mountainArray[mid] > target) {
                right = mid + 1;
            } else if (mountainArray[mid] < target) {
                left = mid - 1;
            }
            return;
        }
        }
    }

