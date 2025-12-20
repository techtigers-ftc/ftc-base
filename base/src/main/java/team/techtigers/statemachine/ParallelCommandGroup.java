package team.techtigers.statemachine;

public class ParallelCommandGroup extends com.arcrobotics.ftclib.command.ParallelCommandGroup {

    public void init(){};

    @Override
    public void initialize() {
        super.initialize();
        init();
    }

    public void update(){};

    @Override
    public void execute() {
        super.execute();
        update();
    }

    public void cleanup(boolean interrupted) {};

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        cleanup(interrupted);
    }

}
