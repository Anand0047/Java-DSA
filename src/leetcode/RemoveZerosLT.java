package leetcode;

public class RemoveZerosLT {
    public static void main(String[] args) {

        long n = 2027202702;
//        String numstr = Long.toString(num)
        String num = Long.toString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0') { // skip '0'
                sb.append(num.charAt(i));
            }
        }

        long result = Long.parseLong(sb.toString());
        System.out.println(result);
    }
}
