import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 3, 1, 3, 4, 2};
        
        // Initialize a HashMap to store frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array and update frequencies
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        // Print the frequencies
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}