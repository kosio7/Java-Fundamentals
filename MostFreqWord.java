import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MostFreqWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> wordOccurrences = new Hashtable<>();
        String[] words = scan.nextLine().toLowerCase().split("\\W+");

        int wordAppearance = 0;
        for (String word : words) {
            Integer counter = wordOccurrences.get(word);
            if (counter == null) {
                counter = 0;
            }
            if (counter + 1 > wordAppearance) wordAppearance = counter + 1;
            wordOccurrences.put(word, counter + 1);
        }

        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            if (entry.getValue() == wordAppearance) {
                System.out.println(entry.getKey() + " -> "+ wordAppearance + " times");
            }
        }
    }
}