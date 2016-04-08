import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArrayStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }

        String input = scan.next();

        switch (input) {
            case "Ascending": {
                numbers.stream()
                        .sorted().forEach(System.out::println);
                break;
            }
            case "Descending": {
                numbers.stream()
                        .sorted((num1, num2) -> num2.compareTo(num1)).forEach(System.out::println);
                break;
            }
        }
    }
}