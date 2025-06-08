public class CustomStackImp {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;
    private int ptr = -1;
    public CustomStackImp(int size) {
        this.data = new int[size];
    }

    public CustomStackImp() {
        this(DEFAULT_SIZE);
    }

    public  boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Cant pop from a empty stack");
        }
        return data[ptr--];
    }
    private boolean isFull() {
        return ptr == data.length-1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }
}
