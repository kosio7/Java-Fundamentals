import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsEndsWithCapital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("([A-Z]*[a-z]+[A-Z]+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group().replace("", " "));
        }
    }
}
