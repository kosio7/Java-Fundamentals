import java.util.Scanner;

public class CharTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char c = 'a';
        for (int i = 1; i <= n ; i+=2) {
            //System.out.print(new String(new char[40-i/2]).replace("\0", " "));
            System.out.println(new String(new char[i]).replace("\0", c +""));
            c++;
        }
    }
}