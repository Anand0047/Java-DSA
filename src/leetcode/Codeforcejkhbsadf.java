package leetcode;
import java.io.*;
import java.util.*;

public class Codeforcejkhbsadf {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            HashSet<Integer> set = new HashSet<>();
            boolean dup = false;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(parts[i]);
                if (!set.add(x)) dup = true;
            }

            if (dup) out.append("YES\n");
            else out.append("NO\n");
        }
        System.out.print(out);
    }
}
