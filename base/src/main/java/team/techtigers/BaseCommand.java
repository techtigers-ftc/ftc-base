package team.techtigers;

import com.arcrobotics.ftclib.command.CommandBase;

/**
 * Base command class that provides init, update, and cleanup methods
 */
public class BaseCommand extends CommandBase {

    /**
     * Initialization method called once when the command is started
     */
    public void init() {}

    @Override
    public final void initialize() {
        init();
    }

    /**
     * Update method called repeatedly while the command is running
     */
    public void update() {}

    @Override
    public final void execute() {
        update();
    }

    /**
     * Cleanup method called once when the command ends
     *
     * @param interrupted whether or not the command has been interrupted
     */
    public void cleanup(boolean interrupted) {}

    @Override
    public final void end(boolean interrupted) {
        cleanup(interrupted);
    }
}
