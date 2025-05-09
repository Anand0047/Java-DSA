public class StaticExamplpe {
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
        StaticExamplpe obj = new StaticExamplpe();
        obj.exam();
        admin();
        obj.collgename();

    }
}