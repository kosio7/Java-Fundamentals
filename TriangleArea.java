import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base = 0;
        double side1 = 0;
        double side2 = 0;

        Scanner scan = new Scanner(System.in);

        int xBase = scan.nextInt();
        int yBase = scan.nextInt();
        int xSide1 = scan.nextInt();
        int ySide1 = scan.nextInt();
        int xSide2 = scan.nextInt();
        int ySide2 = scan.nextInt();

        base = Math.sqrt(Math.pow((xSide1 - xBase), 2) + Math.pow((ySide1 - yBase), 2));
        side1 = Math.sqrt(Math.pow((xSide2 - xSide1), 2) + Math.pow((ySide2 - ySide1), 2));
        side2 = Math.sqrt(Math.pow((xBase - xSide2), 2) + Math.pow((yBase - ySide2), 2));

        double sum = (base + side1 + side2) / 2;

        double result = Math.sqrt(sum * (sum - base) * (sum - side1) * (sum-side2));
        int area = (int) Math.round(result);

        System.out.println(area);
    }
}
