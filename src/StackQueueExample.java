import java.util.*;

public class StackQueueExample {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(19);
//        st.push(119);
//        st.push(139);
//        st.push(119);
//        st.push(319);
//        st.push(519);
//
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(3921);
        q.add(21);
        q.add(9);


        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove(9));
        System.out.println( q);
    }
}
