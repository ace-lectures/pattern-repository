package commands.door;

import commands.Command;
import smarthome.SmartDoor;

public class OpenDoor extends SmartDoorCommand {

    public OpenDoor(SmartDoor d) {
        this.target = d;
    }

    @Override
    public void execute() {
        this.target.open();
    }

    @Override
    public Command revert() {
        return new CloseDoor(this.target);
    }
}
