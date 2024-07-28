public class IdleState implements State {
    private final StateContext context;

    public IdleState(StateContext context) {
        this.context = context;
    }

    @Override
    public boolean isValid() {
        // Condition to enable this state
        return true;
    }

    @Override
    public void execute() {
        // Add idle logic here
    }

}
