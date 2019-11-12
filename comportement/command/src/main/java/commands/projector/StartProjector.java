package commands.projector;

import commands.Command;
import smarthome.SmartProjector;

public class StartProjector extends SmartProjectorCommand {

    public StartProjector(SmartProjector p) {
        this.target = p;
    }

    @Override
    public void execute() {
        this.target.start();
    }

    @Override
    public Command revert() {
        return new ShutdownProjector(this.target);
    }
}
