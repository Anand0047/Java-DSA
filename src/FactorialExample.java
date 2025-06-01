public class FactorialExample {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // base case
        } else {
            return n * factorial(n - 1);  // recursive case
        }
    }

    public static void main(String[] args) {
        int number = 31; // You can change this value
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
