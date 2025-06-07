public class AddDigitsLT {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    static int addDigits(int num) {
        int val =0;
        do{
            int digit = num %10;
            val += digit;
            num %=10;
        }while(val / 10 == 0);

        return val;
    }
}
