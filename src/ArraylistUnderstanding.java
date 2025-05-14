import java.util.ArrayList;

public class ArraylistUnderstanding {
    public static void main(String[] args) {
        ArraylistUnderstanding obj = new ArraylistUnderstanding();
        ArrayList arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add("hello");
        arr.add(1.9f);
//        arr.add(obj);
        System.out.println(arr.get(1));
        System.out.println(arr);
        arr.add(2,87);
        System.out.println(arr);
        System.out.println(arr.size());
        ArrayList arr2 = new ArrayList<>();
        arr2.addAll(arr);
        System.out.println("arr2 =" + arr2);
        System.out.println();
    }
}
