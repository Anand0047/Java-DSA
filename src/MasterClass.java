import java.util.Scanner;

public class MasterClass {
    public static void main(String[] args) {
        BinaryTreeImp tree = new BinaryTreeImp();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
//        tree.display();
        tree.prettyDisplay();
    }

}
