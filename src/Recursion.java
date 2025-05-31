public class Recursion {
    public static void main(String[] args) {

        System.out.println(fibo(50));
    }
    static long fibo(int n ){
        if(n <2) return n;

       return fibo(n-1)+ fibo(n-2);
    }
}
