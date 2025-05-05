public class BubbleSortEx {
    public static void main(String[] args) {
             int[] num = {5,9,2,7,8,1,3};
             int len = num.length;
             int temp =0;

        System.out.println("before sorting");
             for (int n :  num){
                 System.out.print(n + " ");
             }

             for(int i =0;i<len;i++){
                 for (int j = 0;j<len-1;j++)
                 {
                     if (num[j]>num[j+1]){
                         temp = num[j];
                         num[j]=num[j+1];
                         num[j+1]=temp;
                     }
                 }
             }
        System.out.println();
        System.out.println("after sorting ");
             for (int n : num){
                 System.out.print(n+" ");
             }
    }
}
