package team.techtigers;

/**
 * Parallel command group that provides init, update, and cleanup methods
 */
public class ParallelCommandGroup extends com.arcrobotics.ftclib.command.ParallelCommandGroup {

    /**
     * Initialization method called once when the command is started
     */
    public void init(){};

    @Override
    public final void initialize() {
        super.initialize();
        init();
    }

    /**
     * Update method called repeatedly while the command is running
     */
    public void update(){};

    @Override
    public final void execute() {
        super.execute();
        update();
    }

    /**
     * Cleanup method called once when the command ends
     *
     * @param interrupted whether or not the command has been interrupted
     */
    public void cleanup(boolean interrupted) {};

    @Override
    public final void end(boolean interrupted) {
        super.end(interrupted);
        cleanup(interrupted);
    }

}
