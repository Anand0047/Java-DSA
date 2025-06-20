public class LLex {
    public static void main(String[] args) {
        LL list = new LL();
        
            list.insertFirst(3);
            list.insertFirst(7);
            list.insertFirst(67);
            list.insertFirst(54);
            list.insertFirst(16);
            list.insertLast(99);
            list.insert(100, 1);
            list.display();
//        System.out.println(list.size());
            System.out.println(list.deleteFirst());
            list.display();
            System.out.println(list.deleteLast());
            list.display();
//            System.out.println(list.getValueAt(0));
            System.out.println(list.deleteAt(2));
            list.display();



    }
}
