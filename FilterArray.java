import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] words = input.split(" ");

        Arrays.stream(words)
                .filter(n -> n.length() > 3)
                .forEach(System.out::println);
    }
}