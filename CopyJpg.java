import java.io.*;

public class CopyJpg {
    public static void main(String[] args) {
        File jpg = new File("falafel.jpg");
        File copy = new File("my-copied-picture.jpg");

        try (FileInputStream input = new FileInputStream(jpg); FileOutputStream  output= new FileOutputStream(copy)){
            int bytes;
            byte[] buff = new byte[1024];

            while (true) {
                bytes = input.read(buff);
                if (bytes == -1) {
                    break;
                }
                output.write(buff, 0, bytes);
            }
            output.close();
        } catch (FileNotFoundException excfil) {
            System.out.println(excfil);
        } catch (IOException excio) {
            System.out.println(excio);
        }
    }
}
