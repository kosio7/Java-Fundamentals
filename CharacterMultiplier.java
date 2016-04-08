import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.next();
        String second = scan.next();

        Long result = multiplyChars(first, second);
        System.out.println(result);
    }

    private static Long multiplyChars(String string1, String string2) {
        Long totalSum =0L;
        Long remainderSum = 0L;

        if(string1.length() > string2.length()) {
            String remainder = string1.substring(string2.length());
            for (int i = 0; i < remainder.length(); i++) {
                remainderSum += remainder.charAt(i);
            }
        } else  if(string2.length() > string1.length()) {
            String remainder = string2.substring(string1.length());
            for (int i = 0; i < remainder.length(); i++) {
                remainderSum += remainder.charAt(i);
            }
        }

        for (int i = 0; i < string1.length() && i < string2.length(); i++) {
            totalSum += string1.charAt(i) * string2.charAt(i);
        }
        totalSum += remainderSum;
        return totalSum;
    }
}