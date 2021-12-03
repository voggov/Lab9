import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "122.0.0.1, 0.sdd.1.127, 256.11.168.1, 40.";
        String reg = "(\\d[0-255]*\\.){3}\\d[0-255]*";
        Pattern pat = Pattern.compile(reg);
        Matcher matcher = pat.matcher(str);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
