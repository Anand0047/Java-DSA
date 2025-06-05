public class CharUnderStanding {
    public static void main(String[] args) {
        String a2z = new String();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            a2z+=ch;
        }
        System.out.println(a2z);
        System.out.println((char) ('a'+9));
    }
}
