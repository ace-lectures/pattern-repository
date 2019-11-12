package macros;

import commands.Command;
import commands.door.CloseDoor;
import commands.light.SwitchLightOff;
import commands.projector.StartProjector;
import commands.screen.DisplayScreen;
import smarthome.Classroom;

import java.util.LinkedList;
import java.util.List;

public class PresenterMode implements Macro {

    @Override
    public List<Command> expand() {
        List<Command> sequence = new LinkedList<>();
        sequence.add(new CloseDoor(Classroom.backDoor));
        sequence.add(new CloseDoor(Classroom.frontDoor));
        sequence.add(new DisplayScreen(Classroom.screen));
        sequence.add(new StartProjector(Classroom.projector));
        sequence.add(new SwitchLightOff(Classroom.boardLight));
        return sequence;
    }



}
