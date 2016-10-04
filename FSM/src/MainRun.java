import java.util.Scanner;

/**
 * Created by Numl on 04.10.2016.
 */
public class MainRun {

    public static void main(String[] args) {
        FSM handle = new FSM();
        System.out.println("Enter data");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        IncomeData fsmdata = new IncomeData(data);

        handle.handlingData(fsmdata);
        System.out.println("State of FSM after check: " + handle.getState());

        handle.reset();
    }
}
