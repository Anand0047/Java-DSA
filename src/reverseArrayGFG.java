public class reverseArrayGFG {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1,};
        int j = arr.length;
        int[] temp = new int[j];
        for (int i = 0 ;i< arr.length;i++){
            temp[j-1-i]= arr[i];

        }
        for (int n :temp){
            System.out.print(n);
        }
    }
}
