public class CustomStackEx {
    public static void main(String[] args) throws Exception {
        CustomStackImp stack = new DynamicStackImp();

        stack.push(0);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(221);
        stack.push(83);
        stack.push(54);
        stack.push(623);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
