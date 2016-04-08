import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineListsOfLett {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] firstInput = scan.nextLine().toCharArray();
        List<Character> firstLine = new ArrayList<>();

        for (int i = 0; i < firstInput.length; i++) {
            firstLine.add(firstInput[i]);
        }
        char[] lineInputTwo = scan.nextLine().toCharArray();
        List<Character> lineTwo = new ArrayList<>();

        for (int i = 0; i < lineInputTwo.length; i++) {
            lineTwo.add(lineInputTwo[i]);
        }
        List<Character> output = firstLine;

        for (int i = 0; i < lineTwo.size(); i++) {
            if (!firstLine.contains(lineTwo.get(i))) {
                output.add(lineTwo.get(i));
            }
        }
        System.out.print(output);
    }
}