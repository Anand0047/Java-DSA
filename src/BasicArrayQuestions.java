import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrayQuestions {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};

        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();

        for (int num : a) aa.add(num);
        for (int num : b) bb.add(num);

        System.out.println(aa.containsAll(bb));

    }
}
