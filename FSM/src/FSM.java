import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Numl on 04.10.2016.
 */
public class FSM {
    private State state = State.UNKNOW;//состояние по умолчанию

    public State getState() {
        return state;
    }

    public void handlingData(IncomeData incomeData) {
        char[] charArray = incomeData.getText().toCharArray();
        Pattern p = Pattern.compile("[0-1]+");
        Matcher m = p.matcher(incomeData.getText());

        if (incomeData.getText() == null || "".equals(incomeData.getText())) {
            state = State.INCORRECT_DATA;
            return;
        }

        if (m.matches() && charArray.length % 2 == 0) {
            state = State.YES0;
            return;
        }
        else if (m.matches() && charArray.length % 2 != 0){
            state = State.YES1;
        }
        else {
            state = State.NO;
        }

    }

    public void reset() {
        state = State.UNKNOW;
    }


}
