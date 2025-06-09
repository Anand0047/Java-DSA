public class CustomCircularQueueImp {
    protected int[] data;
    private final static int DEFAULT_SIZE = 10;

    protected int first=0;
   protected int end = 0;

   private int size =0;

    public CustomCircularQueueImp() {
        this(DEFAULT_SIZE);
    }
    public CustomCircularQueueImp(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length;
    }
    private boolean isEmpty() {
        return size == 0;
    }
    public boolean insert(int item){
        if (isFull()){
            System.out.println("Can't insert into full stack ");
            return false;
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }
}
