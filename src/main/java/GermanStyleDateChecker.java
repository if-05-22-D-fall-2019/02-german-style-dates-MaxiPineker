import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    private static String regex="^((0?\\d)|((1|2)\\d)|(3(0|1)))" +
                                "(\\s|\\-|\\.)" +
                                "((0?\\d)|(1\\d[0-2]))" +
                                "(\\s|\\-|\\.)" +
                                "((19|20)?\\d\\d)$";
    private static Pattern pattern=Pattern.compile(regex);

    public static Matcher getMatcher(String dateString) {
        return pattern.matcher(dateString);
    }
}
