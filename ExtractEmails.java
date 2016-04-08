import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {

        String regex = "(^|)([a-z\\._]+)@([a-z\\.]+)\\.([a-z]{2,4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("Please contact us at: support@github.com. " +
                "Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information. " +
                "Many users @ SoftUni confuse email addresses. " +
                "We @ Softuni.BG provide high-quality training @ home or @ class. –- steve.parker@softuni.de.  ");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
