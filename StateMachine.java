import java.util.ArrayList;
import java.util.List;

public class StateMachine {
    private final List<State> states = new ArrayList<>();
    private State currentState;

    public void addState(State state) {
        states.add(state);
    }

    public State getCurrentState() {
        if (currentState == null || !currentState.isValid()) {
            for (State state : states) {
                if (state.isValid()) {
                    currentState = state;
                    break;
                }
            }
        }
        return currentState;
    }
}
