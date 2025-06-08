public class CustomStackEx {
    public static void main(String[] args) throws Exception {
        CustomStackImp stack = new CustomStackImp();

        stack.push(0);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
