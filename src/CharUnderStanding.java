public class CharUnderStanding {
    public static void main(String[] args) {
        String a2z = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            a2z +=ch;
        }
        System.out.println(a2z);
    }
}
