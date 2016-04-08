import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        String hexa = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.print(String.format("|%-10s|", hexa));
        System.out.print(String.format("%10s|", binary).replace(' ', '0'));
        System.out.print(String.format("%10.2f|", b));
        System.out.print(String.format("%-10.3f|", c));
    }
}