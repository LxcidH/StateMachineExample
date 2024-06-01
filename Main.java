import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(category = Category.MISC, name = "State Machine Skeleton", author = "YourName", version = 1.0)
public class Main extends AbstractScript {
    private StateMachine stateMachine;
    private StateContext context;

    @Override
    public void onStart() {
        context = new StateContext();

        stateMachine = new StateMachine();
        stateMachine.addState(new IdleState(context)); // Add the IdleState

        // Add other states as needed
    }

    @Override
    public int onLoop() {
        State currentState = stateMachine.getCurrentState();
        if (currentState != null) {
            currentState.execute();
        }
        return 0; // Adjust this value based on your needs
    }
}
