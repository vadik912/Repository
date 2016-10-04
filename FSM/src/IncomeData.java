import java.util.Scanner;

/**
 * Created by Numl on 04.10.2016.
 */
public class IncomeData {
    private final String text;
    /*Scanner sc = new Scanner(System.in);
    private String text = sc.nextLine(); //текст для обработки*/

    public IncomeData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
