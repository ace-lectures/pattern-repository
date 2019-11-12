package commands.projector;

import commands.Command;
import smarthome.SmartProjector;

public class ShutdownProjector extends SmartProjectorCommand {

    public ShutdownProjector(SmartProjector p) {
        this.target = p;
    }

    @Override
    public void execute() {
        this.target.shutdown();
    }

    @Override
    public Command revert() {
        return new StartProjector(this.target);
    }
}
