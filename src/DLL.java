public class DLL {

    Node head;

    public void insertFirst(int val){

        Node node = new Node(val);

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
