import java.util.Scanner;

public class LargestStringSeq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split("\\s+");
        int longest = 0;
        int current = 1;

        String longestString = "";
        String currentString = array[0];

        for (int i = 1; i < array.length; i++) {
            if (currentString.contentEquals(array[i])) {
                current += 1;
            } else {
                currentString = array[i];
                current = 1;
            }

            if (current > longest) {
                longest = current;
                longestString = currentString;
            }
        }

        for (int i = 0; i < longest; i++) {
            System.out.print(longestString + " ");
        }

        if (array.length == 1) {
            System.out.print(currentString);
        }
    }
}