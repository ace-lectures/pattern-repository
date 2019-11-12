package commands;

public interface Command {

    void execute();

    Command revert();

    default void display() {
        System.out.println("  " + this.getClass().getCanonicalName());
    }


}
