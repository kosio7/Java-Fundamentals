import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter writer = new BufferedWriter(new PrintWriter(new FileWriter("text.txt")));

            String info;
            while ((info = reader.readLine()) != null) {
                writer.write("\r\n" + info.toUpperCase());
            }
            reader.close();
            writer.close();
        } catch (IOException ioex) {
            System.out.println(ioex);
        }
    }
}
