public class abstractdemo {
        static int num = 0;
    public static void main(String[] args) {
//        abstractdemo obj = new abstractdemo();
//        obj.methodAb();
//        obj.methodAB1();
        A obj2 = new A() {
            @Override
            void methodAb() {
                System.out.println("i am abstract");
            }
        };
        obj2.methodAB1();
        obj2.methodAb();
    }
}
abstract class A{
    abstract void methodAb();
    void methodAB1(){
        System.out.println("methodAb1");
    }
}
