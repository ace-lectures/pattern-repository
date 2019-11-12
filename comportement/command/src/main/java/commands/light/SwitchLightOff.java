package commands.light;

import commands.Command;
import smarthome.SmartLight;

public class SwitchLightOff extends SmartLightCommand {

    public SwitchLightOff(SmartLight l) {
        this.target = l;
    }

    @Override
    public void execute() {
        this.target.switchStatus(false);
    }

    @Override
    public Command revert() {
        return new SwitchLightOn(this.target);
    }
}
