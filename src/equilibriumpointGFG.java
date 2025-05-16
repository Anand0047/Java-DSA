public class equilibriumpointGFG {
    public static void main(String[] args) {

        int [] arr = {-7, 1, 5, 2, -4, 3, 0};
            int totalsum = 0;
       for(int n:arr){
           totalsum+=n;
       }

       int leftsum =0;
        for (int i = 0; i < arr.length; i++) {
            totalsum -= arr[i];

            if (leftsum==totalsum){
                System.out.println(i);
            }else {
                leftsum+=arr[i];
            }
        }

    }
}
