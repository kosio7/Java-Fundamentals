import java.io.*;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by admin on 3/20/2016.
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers, separated by a space");
        String[] input = scanner.nextLine().split(" ");
        System.out.println("Enter sorting order [Ascending/Descending]:");
        String sortingOrder = scanner.nextLine();
        if (sortingOrder.equals("Ascending")) {
            Arrays.stream(input)
                    .map(n -> Integer.parseInt(n))
                    .sorted()
                    .forEach(n -> System.out.print(n + " "));
        } else if (sortingOrder.equals("Descending")) {
            Arrays.stream(input)
                    .map(n -> Integer.parseInt(n))
                    .sorted((n1, n2) -> n2.compareTo(n1))
                    .forEach(n -> System.out.print(n + " "));
        } else {
            System.out.println("Invalid sorting order");
        }
    }
}
