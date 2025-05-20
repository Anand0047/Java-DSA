public class PowerXN_Leetcode {
    public static void main(String[] args) {
        double x = 2.00000;
        int  n = 10;
        myPow(x,n);

    }
    public static double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;

        }

        double result = 1.0;
        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }
}