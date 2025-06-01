import java.util.*;

public class StringBuilder111 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        java.lang.StringBuilder st = new java.lang.StringBuilder(str);
//        String reversedSt = st.reverse().toString();
//        System.out.println(reversedSt);

//        String name = "bccaccd";
//        StringBuilder sb = new StringBuilder();
//        for (int i =0;i<name.length();i++){
//            if (name.charAt(i) != 'a'){
//                sb.append(name.charAt(i));
//            }
//        }
//        System.out.println(sb);

//        String name = "Anand";
//        System.out.println( name.substring(1));
        skip("","anand");
        System.out.println(skipapple("anandappleraj"));
    }
    static void skip(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    static String skipapple(String up){
        if (up.isEmpty()) return "";
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }
    static String skipAppNotapple(String up){
        if (up.isEmpty()) return "";
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotapple(up.substring(5));
        }else {
            return up.charAt(0) + skipAppNotapple(up.substring(1));
        }
    }
}
