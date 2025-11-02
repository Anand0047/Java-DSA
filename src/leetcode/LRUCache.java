package leetcode;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.HashMap;

public class LRUCache {

    class Node{
        int val;
        int key;
        Node next;
        Node prev;

        public Node(int key,int val){
            this.val = val;
            this.key = key;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();

    public LRUCache(int capacity) {
        this.cap = capacity;
        head.next = tail;
        tail.prev = head;


    }

    public int get(int key) {

        if (!m.containsKey(key)) return -1;

        Node node = m.get(key);
        deleteNode(node);
        addFirst(node);

        return node.val;
    }

    public void put(int key, int value) {

        if (m.containsKey(key)){
            Node node = m.get(key);
            deleteNode(node);
            node.val = value;
            addFirst(node);
        }else{
            if (m.size()==4){
                Node node = tail.prev;
                deleteNode(node);
                m.remove(key);
            }
            Node node = new Node(key,value);
            addFirst(node);
            m.put(key,node);
        }

    }

    void deleteNode(Node node){

        Node prevNode = node.prev;
        Node afterNode = node.next;

        prevNode.next = afterNode;
        afterNode.prev = prevNode;
    }


    void addFirst(Node node){
        Node temp = head.next;


        node.next = temp;
        node.prev = head;
        head.next= node;
        temp.prev = node;
    }
}
