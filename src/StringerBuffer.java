import java.util.Scanner;

public class StringerBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fn= sc.next();
        StringBuffer obj = new StringBuffer(fn);
        String name = obj.append(" raj").toString();
        System.out.println(name);
        String newname= obj.substring(1,4);
        System.out.println(newname);
    }
}
