import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList< Integer>();
        List ml = new ArrayList();

        al.add(1000);
        al.add("srm");
        al.add(10.5);
        al.add(1000);
        al.add(true);
        al.add("srm");
        System.out.println(al.size());
    }
}
