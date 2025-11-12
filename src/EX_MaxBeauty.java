import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class EX_MaxBeauty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            System.out.println(maxBeauty(line));
        }
    }
    private static int maxBeauty(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[Character.toLowerCase(ch) - 'a']++;
            }
        }
        int a =1;
        a++;

        Arrays.sort(freq);
        int value = 26, beauty = 0;
        for (int i = 25; i >= 0 && freq[i] > 0; i--) {
            beauty += freq[i] * value;
            value--;
        }
        return beauty;
    }
}
