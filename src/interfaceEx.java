public class interfaceEx implements interf1,interf2,interf3{
    @Override
    public void method() {
        System.out.println("This is interface 1 ");
    }

    public static void main(String[] args) {
        interfaceEx obj = new interfaceEx();
        obj.method();

        interf2.method();
        interf3.methods3();
    }
}

interface interf1{
    void method();
}
interface interf2{
    static void method(){
        System.out.println("this is Interface 2 ");
    }
}
interface  interf3{
    static void methods3(){
        System.out.println("This is Interface 3 ");
    }
}