import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sentence = scan.nextLine().split("(\\s+)|(')|(\\-)");

        System.out.println(sentence.length);
    }
}
