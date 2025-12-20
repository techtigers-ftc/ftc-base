package team.techtigers.statemachine;

import com.arcrobotics.ftclib.command.CommandBase;

public class BaseCommand extends CommandBase {

    public void init() {}

    @Override
    public void initialize() {
        init();
    }

    public void update() {}

    @Override
    public void execute() {
        update();
    }

    public void cleanup(boolean interrupted) {}

    @Override
    public void end(boolean interrupted) {
        cleanup(interrupted);
    }
}
