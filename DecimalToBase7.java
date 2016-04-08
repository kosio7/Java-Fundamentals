import java.util.Scanner;

public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        System.out.println(Integer.toString(x, 7));
    }
}
