package macros;

import commands.Command;
import commands.Receiver;

import java.util.Iterator;
import java.util.List;

public interface Macro {
    List<Command> expand();

    default void run(Receiver r) {
        Iterator<Command> toDos = expand().iterator();
        while(toDos.hasNext()) {
            r.invoke(toDos.next());
        }
    }

}
