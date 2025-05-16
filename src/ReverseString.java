public class ReverseString {
    public static void main(String[] args) {
        String name = "anand";
        String newn = "";
        for (int i =name.length()-1;i>=0;i--){
            newn += name.charAt(i);
        }
        System.out.println(newn);
    }
}
