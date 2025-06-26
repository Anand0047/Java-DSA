import java.util.ArrayList;
import java.util.List;

public class MasterClass {
    public static void main(String[] args) {
//        BinaryTreeImp tree = new BinaryTreeImp();
//        Scanner sc = new Scanner(System.in);
//        tree.populate(sc);
//        tree.display();
//        tree.prettyDisplay();
//        String s1 = "anagram";
//        String s2 = "nagaram";
//        System.out.println(s2.contentEquals(s2));
//        StringBuilder sb = new StringBuilder(s1);
//        StringBuilder sb2 = new StringBuilder(s2);
//        System.out.println(sb.equals(sb2));




//            String[] st = {"flower","flow","flight"};
//        ArrayList<String> arr = new ArrayList<>(List.of(st));
//        System.out.println(longestCommonPrefix(st));
//        System.out.println(arr.isEmpty());

    }


    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }
        Object[] nsa = {3,2,2,3};
        nsa = al.toArray();

return 0;
    }







    public static String longestCommonPrefix(String[] st) {

        String res ="";
        int num = st.length;
        for (int i = 0; i < num; i++) {
                if (st[0].charAt(i) == st[1].charAt(i) && st[0].charAt(i)== st[2].charAt(i) ){
                    res += st[0].charAt(i);
                }else {
                    return res;
                }

        }
    return res;
    }

}
