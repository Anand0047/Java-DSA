public class Abstract2 extends AA{
    @Override
    String methodAD(){
        return "i am abstarct";
    }
    public static void main(String[] args) {
        Abstract2 obj = new Abstract2();
        System.out.println(obj.methodAD());
        obj.methodA();
        obj.method1();
        obj.method2();
    }
}
abstract  class AA extends B{
    abstract String methodAD();
    void methodA(){
        System.out.println("Method A from the class A");
    }
}
class B{
    void method1(){
        System.out.println(" i am method 1 in B");
    }
    void method2(){
        System.out.println(" i am method 2 in B");
    }
}
