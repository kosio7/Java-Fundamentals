import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = 0; i <= max - min ; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt((max - min) + 1) + min;

            System.out.print(randomNum + " ");
        }
    }
}