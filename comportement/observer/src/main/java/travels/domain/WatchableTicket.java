package travels.domain;

import travels.Watchable;
import travels.Watcher;
import travels.watchers.TicketWatcher;

import java.util.HashSet;
import java.util.Set;

public class WatchableTicket extends Ticket implements Watchable {

    private Set<TicketWatcher> watchers;

    public WatchableTicket(String from, String to, double price) {
        super(from, to, price);
        this.watchers = new HashSet<>();
    }

    @Override
    public void changePrice(double percentage) {
        super.changePrice(percentage);
        broadcast();
    }

    @Override
    public void attach(Watcher w) {
        System.out.println("  "+w.getName()+" is now watching this " + from + " -> " + to+" flight ["+w.getClass().getSimpleName()+"].");
        this.watchers.add(w);
    }

    @Override
    public void detach(TicketWatcher w) {
        System.out.println("  "+w.getName()+" is not watching anymore the " + from + " -> " + to+" flight.");
        this.watchers.remove(w);
    }

    @Override
    public void broadcast() {
        watchers.parallelStream().forEach(TicketWatcher::update);
    }

}
