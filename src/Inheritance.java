import java.util.Scanner;

class inheri{

    String method(String name){

        return "hello "+name;
    }
    void methodtwo(){
        System.out.println("this is second class");
    }
}
public class Inheritance extends  inheri{
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(obj.method(input));
        obj.methodtwo();

    }
}
