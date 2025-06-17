import java.util.Scanner;

public class MasterClass {
    public static void main(String[] args) {
        BinaryTreeImp tree = new BinaryTreeImp();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
//        tree.prettyDisplay();
//        String s1 = "anagram";
//        String s2 = "nagaram";
//        System.out.println(s2.contentEquals(s2));
//        StringBuilder sb = new StringBuilder(s1);
//        StringBuilder sb2 = new StringBuilder(s2);
//        System.out.println(sb.equals(sb2));

    }

}
