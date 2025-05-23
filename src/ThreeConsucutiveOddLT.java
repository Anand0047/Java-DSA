public class ThreeConsucutiveOddLT {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        int count =0;

        for (int i =0;i< arr.length;i++){
            if (arr[i]%2==1){
                count++;
            }else {
                count=0;
            }
            if (count==3){
                System.out.println("yes");
            }
        }
    }
}
