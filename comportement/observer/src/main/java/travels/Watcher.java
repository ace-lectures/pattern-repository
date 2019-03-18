package travels;

import java.util.Objects;

public abstract class Watcher {

    private String name;
    protected Ticket ticket;

    public String getName() { return name; }

    protected Watcher(String name, Ticket t) {
        this.name = name;
        this.ticket = t;
        t.register(this);
    }

    public synchronized void update() {
        System.out.println("["+name+"] is receiving an update [" + this.getClass().getSimpleName()+"]");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Watcher)) return false;
        Watcher watcher = (Watcher) o;
        return Objects.equals(name, watcher.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() { return name ; }
}
