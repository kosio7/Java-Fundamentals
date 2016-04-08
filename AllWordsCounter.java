import java.util.Scanner;

public class AllWordsCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] string = scan.nextLine().split("(\\s+)|(')|(\\-)");

        System.out.println(string.length);
    }
}
