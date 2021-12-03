import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Пришел поехали прибрежный вава слово какое-то чушь прекрасный ";
        String regex = "\\b(пре|Пре|при|При)[а-я]*";
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(str);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
