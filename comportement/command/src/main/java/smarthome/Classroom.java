package smarthome;

public class Classroom {

    public static SmartLight frontLight = new SmartLight("front light");
    public static SmartLight backLight = new SmartLight("back light");
    public static SmartLight boardLight = new SmartLight("board");

    public static SmartScreen screen = new SmartScreen();
    public static SmartProjector projector = new SmartProjector();

    public static SmartDoor frontDoor = new SmartDoor("front door");
    public static SmartDoor backDoor = new SmartDoor("back door");
}
