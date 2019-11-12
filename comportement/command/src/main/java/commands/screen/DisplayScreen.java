package commands.screen;

import commands.Command;
import smarthome.SmartScreen;

public class DisplayScreen extends SmartScreenCommand {

    public DisplayScreen(SmartScreen s) {
        this.target = s;
    }

    @Override
    public void execute() {
        this.target.down();
    }

    @Override
    public Command revert() {
        return new HideScreen(this.target);
    }
}
