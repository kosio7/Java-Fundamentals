import java.util.Scanner;

public class CountSubstringOccur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();
        String searchString = scan.nextLine().toLowerCase();

        int index = input.indexOf(searchString);
        int count = 0;

        while (index != -1) {
            index = input.indexOf(searchString, index + 1);
            count++;
        }
        System.out.print(count);
    }
}
