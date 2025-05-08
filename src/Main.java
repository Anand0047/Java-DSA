public class Main{
    String name = "Srm";
    void exam(){
        System.out.println("This is exam");
    }
    void collgename(){
        System.out.println("collge name is " + name);
    }
    static  void admin(){
        System.out.println("This is admin");
    }
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Main obj = new Main();
        obj.exam();
        admin();
        obj.collgename();

    }
}