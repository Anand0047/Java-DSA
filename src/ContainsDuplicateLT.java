import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateLT {
    public static boolean main(String[] args) {
        int[] nums = {1,2,3,1};
        Set<Integer> set = new HashSet<>();
        for (int i : nums){

            if (set.contains(i)){
                return true;
            }
            set.add(i);

        }
       return false;
    }
}
