package team.techtigers.statemachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class StateMachineTest {

    private StateMachine stateMachine;
    private State mockState;
    private Transition mockTransition;

    @BeforeEach
    void setUp() {
        stateMachine = new StateMachine();
        mockState = mock(State.class);
        when(mockState.getName()).thenReturn("mockState");
        mockTransition = mock(Transition.class);
    }

    @Test
    @DisplayName("Setting the current state to a non-existent state throws IllegalArgumentException")
    void setCurrentStateToNonExistentStateThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> stateMachine.setCurrentState(mockState));
    }

    @Test
    @DisplayName("Setting the first state to an existing state does not throw exception")
    void setCurrentStateToExistingState() {
        stateMachine.addState(mockState);
        assertDoesNotThrow(() -> stateMachine.setCurrentState(mockState));
    }

    @Test
    @DisplayName("Starting without a current state set throws IllegalStateException")
    void startWithoutCurrentStateSetThrowsException() {
        assertThrows(IllegalStateException.class, () -> stateMachine.start());
    }

    @Test
    @DisplayName("Starting with a current state set does not throw exception")
    void startWithCurrentStateSet() {
        stateMachine.addState(mockState);
        stateMachine.setCurrentState(mockState);
        assertDoesNotThrow(() -> stateMachine.start());
    }

    @Test
    @DisplayName("Updating state machine without conditions does nothing")
    void updateWithoutConditionsDoesNothing() {
        stateMachine.addState(mockState)
                .setCurrentState(mockState);
        stateMachine.start();

        assertDoesNotThrow(() -> stateMachine.update());
    }
}