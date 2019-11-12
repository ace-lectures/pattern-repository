package commands.screen;

import commands.Command;
import smarthome.SmartScreen;

public class HideScreen extends SmartScreenCommand {

    public HideScreen(SmartScreen s) {
        this.target = s;
    }

    @Override
    public void execute() {
        this.target.up();
    }

    @Override
    public Command revert() {
        return new DisplayScreen(this.target);
    }
}
