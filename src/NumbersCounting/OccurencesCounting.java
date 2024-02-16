package NumbersCounting;

import java.util.HashMap;
import java.util.Map;

public class OccurencesCounting {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 4, 1, 1, 1, 1};
        Map<Integer, Integer> occurences = new HashMap<>();

        for (int number : numbers) {
            if (occurences.containsKey(number)) {
                occurences.replace(number, occurences.get(number) + 1);
            } else {
                occurences.put(number, 1);
            }
        }

        for (Integer key : occurences.keySet()) {
            System.out.println("Liczba " + key + " pojawila sie " + occurences.get(key) + " razy.");
        }
    }
}
