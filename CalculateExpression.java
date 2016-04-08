import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double f1 = ((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)));
        double f1power = (a + b + c) / Math.sqrt(c);
        double f1result = Math.pow(f1, f1power);

        double f2 = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3));
        double f2power = a - b;
        double f2result = Math.pow(f2, f2power);

        double abcAverage = (a + b + c) / 3;
        double f1f2Average = (f1result + f2result) / 2;
        double diff = Math.abs(abcAverage - f1f2Average);

        System.out.print(String.format("F1 result: %1.2f; ", f1result));
        System.out.print(String.format("F2 result: %1.2f; ", f2result));
        System.out.print(String.format("Diff: %1.2f", diff));
    }
}