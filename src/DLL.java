public class DLL {

    private Node head;

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node ;
    }
    public void display(){
        Node node = head;
        Node last = null ;
        System.out.println("Printing Straight");
        while (node != null){
            System.out.print(node.value + "-->");
            last = node ;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse");
        while(last != null){
            System.out.print(last.value + "-->");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int value ;
        Node prev ;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
