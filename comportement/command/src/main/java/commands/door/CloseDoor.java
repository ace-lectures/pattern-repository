package commands.door;

import commands.Command;
import smarthome.SmartDoor;

public class CloseDoor extends SmartDoorCommand {

    public CloseDoor(SmartDoor d) {
        this.target = d;
    }

    @Override
    public void execute() {
        this.target.close();
    }

    @Override
    public Command revert() {
        return new OpenDoor(this.target);
    }
}
