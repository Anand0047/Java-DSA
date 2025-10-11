package leetcode;
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}
public class GFG_RotateLL {
    public Node rotate(Node head, int k) {
        // code here
        Node sizeFinder = head;
        int size =0;
        while(sizeFinder != null){
            sizeFinder = sizeFinder.next;
            size++;
        }


        if(k>size){
            k%=size;
        }

        Node temp = head;
        for(int i =0;i<k;i++){
            temp = temp.next;
        }

        Node newHead = temp.next;
        newHead.next = head;
        temp.next = null;

        return newHead;
    }
}
