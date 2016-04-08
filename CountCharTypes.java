import java.io.*;

public class CountCharTypes {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter writer = new BufferedWriter(new PrintWriter(new FileWriter("count-chars.txt")));

            String data;
            int vowels = 0;
            int consonants = 0;
            int punctMarks = 0;

            while ((data = reader.readLine()) != null) {
                for (int i = 0; i < data.length(); i++) {
                    char ch = data.charAt(i);
                    if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                        vowels++;
                    }
                    if (ch == '!'||ch ==','||ch == '.'||ch == '?') {
                        punctMarks++;
                    } else if (ch != ' '&&ch != 'a'&&ch != 'e'&&ch != 'i'&&ch != 'o'&&ch != 'u'&&ch != '!'&&ch !=','&&ch != '.'&&ch != '?') {
                        consonants++;
                    }
                }
                String vow = ("Vowels: " + vowels);
                String cons = ("Consonants: " + consonants);
                String marks = ("Punctuation: " + punctMarks);
                writer.write("\n" + vow);
                writer.write("\r\n" + cons);
                writer.write("\r\n" + marks);
            }
            writer.close();
        } catch (IOException ioex) {
            System.out.println(ioex);
        }
    }
}