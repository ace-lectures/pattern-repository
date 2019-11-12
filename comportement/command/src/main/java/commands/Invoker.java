package commands;

import java.util.Stack;

public class Invoker {

    private Stack<Command> history;

    public Invoker() {
        this.history = new Stack<>();
    }

    public void invoke(Command c) {
        execute(c);
        this.history.push(c);
    }

    public void cancel() {
        Command last = history.pop();
        System.out.print("** Cancelling ");
        last.display();
        execute(last.revert());
    }

    public void reset() {
        System.out.println("** Cancelling all commands");
        while (!history.empty()) {
            Command c = history.pop();
            execute(c.revert());
        }
    }

    private void execute(Command c) {
        c.display();
        c.execute();
    }

}
