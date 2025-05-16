import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class findDuplicatesGFG {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};

        List<Integer> newlist = new ArrayList<>();


        for (int i:arr){
            newlist.add(i);

        }
        for (Integer i :newlist){
            if (newlist.contains(i)){
                newlist.remove(i);
            }

        }
        System.out.println(newlist);
    }
}
