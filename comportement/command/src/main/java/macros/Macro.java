package macros;

import commands.Command;
import commands.Invoker;

import java.util.Iterator;
import java.util.List;

public interface Macro {
    List<Command> expand();

    default void run(Invoker r) {
        Iterator<Command> toDos = expand().iterator();
        while(toDos.hasNext()) {
            r.invoke(toDos.next());
        }
    }

}
