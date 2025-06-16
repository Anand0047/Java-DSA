import java.util.Scanner;
import java.util.Stack;

class BinaryTreeImp {

    public BinaryTreeImp() {

    }
    private Node root;





    
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    public void populate(Scanner sc ){
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " +  node.value);
        Boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of " + node.value);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }

        System.out.println("Do you want to enter left of " +  node.value);
        Boolean right = sc.nextBoolean();
        if (right){
            System.out.println("Enter the value of the right of " + node.value);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc,node.right);
        }
    }



    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}
