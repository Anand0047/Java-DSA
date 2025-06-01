public class Subsequences {
    public static void main(String[] args) {

    subseq("","abcd");

    }
    static void subseq(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(ch+p,up.substring(1));
        subseq(p,up.substring(1));
    }
}
