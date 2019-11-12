package commands.light;

import commands.Command;
import smarthome.SmartLight;

public class SwitchLightOn extends SmartLightCommand {

    public SwitchLightOn(SmartLight l) {
        this.target = l;
    }

    @Override
    public void execute() {
        this.target.switchStatus(true);
    }

    @Override
    public Command revert() {
        return new SwitchLightOff(this.target);
    }
}
