import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringClass {

    public MyStringClass() {
    }

    public boolean checkPunctuationMarks(String str) {
        Pattern regexe = Pattern.compile("^[^,^.^;^:^!^?^...]*$");
        Matcher match = regexe.matcher(str);
        return match.find();
    }

    public boolean checkPalindrom(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public void print(String str) {
        Pattern regex = Pattern.compile("[^,^.^^\\s]+");
        Matcher match = regex.matcher(str);
        while (match.find())
            System.out.println(match.group());

    }

}
