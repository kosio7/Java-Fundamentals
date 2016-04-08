import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("text.txt"));
            String info;
            int asciiSum = 0;

            while ((info = read.readLine()) != null) {

                for (int i = 0; i < info.length(); i++) {
                    asciiSum += (int)info.charAt(i);
                }
                System.out.println(asciiSum);
            }

        } catch (IOException ioex) {
                System.out.println(ioex);
        }
    }
}
