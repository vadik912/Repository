
/**
 * Created by Numl on 04.10.2016.
 */
public class FSM {
    private State state = State.UNKNOWN;//состояние по умолчанию

    public State getState() {
        return state;
    }

    public void handlingData(InData inData) {
        int numberOfZero = 0;
        int numberOfOne = 0;

        if (inData.getText().equals("End")) {
            System.exit(0);
        }

        if (inData.getText() == null || "".equals(inData.getText())) {
            state = State.INCORRECT_DATA;
            return;
        }

        for (char aChar : inData.getText().toCharArray()) {
            if (aChar == '0') {
                numberOfZero++;
            } else if (aChar == '1') {
                numberOfOne++;
            } else {
                state = State.INCORRECT_DATA;
                return;
            }
        }

        state = numberOfZero % 2 == 0 && numberOfOne % 2 != 0 ?
                State.YES :
                State.NO;
    }

    public void reset() {
        state = State.UNKNOWN;
    }


}
