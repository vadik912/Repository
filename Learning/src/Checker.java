import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Numl on 03.10.2016.
 */
public class Checker {
    public static String state(String inputNumbers) {
        char[] charArray = inputNumbers.toCharArray();
        Pattern p = Pattern.compile("[0-1]+");
        Matcher m = p.matcher(inputNumbers);
        if (m.matches()) {
            return charArray.length % 2 == 0 ? "Yes 0" : "Yes 1";
        }
        return "No";

    }

}
