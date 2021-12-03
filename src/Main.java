import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "15.22, 4, 78, 54, 99999, 100.25846, 7777777, 89, 75, wqed, 0.1, 999999999999999, 23.12e+10,";
        String regex = "\\d*\\.(\\d*e\\+\\d*|\\d*)";
        Pattern reg = Pattern.compile(regex);
        Matcher math = reg.matcher(str);
        while (math.find())
                System.out.println(math.group());
    }
}
