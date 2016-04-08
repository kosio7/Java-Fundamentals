import java.util.Scanner;

public class SeqEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] stringArray = console.nextLine().split("\\s+");
        String arrElement = stringArray[0];

        for (int i = 1; i < stringArray.length; i++) {
            if (arrElement.contentEquals(stringArray[i])) {
                System.out.print(arrElement + " ");
            } else {
                System.out.println(arrElement);
                arrElement = stringArray[i];
            }
            if (i == stringArray.length - 1) {
                System.out.print(arrElement);
            }
        }
    }
}
