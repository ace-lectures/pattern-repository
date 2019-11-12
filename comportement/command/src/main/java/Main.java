import commands.Invoker;
import commands.light.SwitchLightOn;
import macros.PresenterMode;
import smarthome.Classroom;

public class Main {

  public static void main(String[] args) {

    Invoker remote = new Invoker();

    System.out.println("Piloting Smart lights");
    remote.invoke(new SwitchLightOn(Classroom.frontLight));
    remote.invoke(new SwitchLightOn(Classroom.backLight));

    System.out.println("Cancelling last command");
    remote.cancel();

    System.out.println("Switching into presenter mode");
    (new PresenterMode()).run(remote);

    System.out.println("Switching back to initial state");
    remote.reset();

  }

}
