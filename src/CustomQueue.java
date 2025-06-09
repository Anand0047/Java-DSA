public class CustomQueue {
    private int[] data;
    private final static int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
     this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
       this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    private boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(int item){
        if (isFull()){
            System.out.println("Can't insert into full stack ");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
       if (isEmpty()){
           throw new Exception("Cant Remove from the empty queue");
       }
       int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("Cant Remove from the empty queue");
        }
        return data[0];
    }
}


