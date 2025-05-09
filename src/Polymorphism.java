public class Polymorphism {
   int num( int a, int b){
       System.out.println(a+b);
       return (a+b);

    }
    double num (double c , double d, double e){
       return (c-d- e);
    }
    float num (float w , float  r ){
       return (w/r);
    }

    public static void main(String[] args) {
        Polymorphism p2 = new Polymorphism();
        System.out.println(p2.num(10.2, 8.2, 9.87));
    }
}