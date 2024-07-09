package team.techtigers.statemachine;

import com.arcrobotics.ftclib.command.CommandBase;

/**
 * Base class for all states, which are used to run a a step of a state machine
 * @param <T> The type of the condition, usually an enum
 */
public abstract class State<T> extends CommandBase {

    /**
     * @return The current condition of the state, usually an enum
     */
    public abstract T getCurrentCondition();
}
