package team.techtigers.statemachine;

public abstract class SequentialCommandGroup extends com.arcrobotics.ftclib.command.SequentialCommandGroup {

    public abstract void init();

    @Override
    public void initialize() {
        super.initialize();
        init();
    }

    public abstract void update();

    @Override
    public void execute() {
        super.execute();
        update();
    }

    public abstract void cleanup();

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        cleanup();
    }

}
