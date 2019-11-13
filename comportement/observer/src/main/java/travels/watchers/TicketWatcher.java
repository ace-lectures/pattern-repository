package travels.watchers;

import travels.Watcher;
import travels.domain.Ticket;
import travels.domain.WatchableTicket;

import java.util.Objects;

public abstract class TicketWatcher implements Watcher {

    private String name;
    protected Ticket ticket;

    public String getName() { return name; }

    protected TicketWatcher(String name, WatchableTicket t) {
        this.name = name;
        this.ticket = t;
        t.attach(this);
    }

    public void update() {
        System.out.println("["+name+"] is receiving an update [" + this.getClass().getSimpleName()+"]");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketWatcher)) return false;
        TicketWatcher watcher = (TicketWatcher) o;
        return Objects.equals(name, watcher.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() { return name ; }
}
