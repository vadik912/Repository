import java.util.Scanner;

/**
 *
 * Created by Numl on 03.10.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter");
    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String test = Checker.state(str);
        System.out.println("For test");
        System.out.println(test);

    }
}
