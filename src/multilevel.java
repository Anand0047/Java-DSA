public class multilevel extends genD {
    public static void main(String[] args) {
        multilevel obj = new multilevel();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}
class genA{
    void methodA(){
        System.out.println("This is Method A");
    }
}
class genB extends genA{
    void methodB(){
        System.out.println("This is Method B");
    }
}
class genC extends genB{
    void methodC(){
        System.out.println("This is Method C");
    }
}
class genD extends genC{
    void methodD(){
        System.out.println("This is Method D");
    }
}