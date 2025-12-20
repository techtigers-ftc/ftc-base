package team.techtigers.statemachine;

public class SequentialCommandGroup extends com.arcrobotics.ftclib.command.SequentialCommandGroup {

    public void init(){};

    @Override
    public void initialize() {
        super.initialize();
        init();
    }

    public void update(){}

    @Override
    public void execute() {
        super.execute();
        update();
    }

    public void cleanup(boolean interrupted){}

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        cleanup(interrupted);
    }
}
