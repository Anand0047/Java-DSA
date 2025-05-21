public class LLex {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(67);
        list.insertFirst(54);
        list.insertLast(99);
        list.display();
        System.out.println(list.size());
    }
}
