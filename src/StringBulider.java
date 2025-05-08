import java.util.*;

public class StringBulider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder st = new StringBuilder(str);
        String reversedSt = st.reverse().toString();
        System.out.println(reversedSt);


    }
}
