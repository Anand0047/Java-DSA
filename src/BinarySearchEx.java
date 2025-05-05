public class BinarySearchEx {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,6,7,8,12,14,15,17,19,21};
        int target = 9;
        int lenght = num.length;
        int result = BinarySearch(num,target,0,lenght-1);
        if (result>=0){
            System.out.println("element found at index:"+result);
        }else {
            System.out.println("Elemet not found");
        }
    }

    static  int BinarySearch(int[] num,int target,int left , int right){
        while (left<=right){
            int mid = (left + right)/2;
            if (num[mid]==target){
                return mid;
            } else if (num[mid]>target) {
                return BinarySearch(num, target, left, mid-1);
            }else if (num[mid]<target){
                return BinarySearch(num, target, mid+1, right);
            }
        }
        return -1;
    }
}
