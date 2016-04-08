import java.util.Scanner;

public class CountSpecWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().toLowerCase().split("(\\s+|'|\\-)");
        String equalWords = scan.nextLine();

        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].contentEquals(equalWords)) {
                count += 1;
            }
        }
        System.out.print(count);
    }
}