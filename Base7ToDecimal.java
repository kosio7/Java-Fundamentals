import java.util.Scanner;

public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String base7 = scan.nextLine();

        Integer decimal = Integer.valueOf(base7, 7);
        System.out.println(decimal);
    }
}