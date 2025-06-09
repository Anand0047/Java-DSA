public class CustomQueueEx {
    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue(5);
        q.insert(5);
        System.out.println(q.remove());

    }
}
