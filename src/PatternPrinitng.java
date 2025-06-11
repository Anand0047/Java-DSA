public class PatternPrinitng {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for(int j =1;j<=i;j++){
                System.out.print(((i * (i - 1)) / 2 + j) + " ");
            }
            System.out.println();
        }

//        for(int i = 1; i <= 5; i++) { // Rows
//            int start = (i * (i - 1)) / 2 + 1; // Calculate starting number for the row
//            for (int j = 1; j <= i; j++) { // Columns
//                System.out.print((start + j - 1) + " ");
//            }
//            System.out.println();
//        }

    }
}
