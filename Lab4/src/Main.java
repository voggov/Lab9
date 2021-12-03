import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] str = {
                "4 + 2 - 7 * 9",
                "(3 + 5) – 9 × 4",
                " ((3 + 5) – 9 × 4",
                "(((5*8)-90)+100)",
                "(3 + 5) – (9 × 4)",
                "528 * 1000 -( 5 + 7"
        };
        Pattern regex = Pattern.compile("^([^\\(\\)]*(\\([^\\(\\)]*(\\([^\\(\\)]*(\\([^\\(\\)]*\\))*[^\\(\\)]*\\))*[^\\(\\)]*\\))*[^\\(\\)]*){1,}$");
        Matcher matcher;
        for (int i = 0; i < str.length; i++) {
            matcher = regex.matcher(str[i]);
            if (matcher.find())
                System.out.println(matcher.group());
        }

    }
}
