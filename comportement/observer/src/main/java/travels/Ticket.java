package travels;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ticket {

    private String from;
    private String to;
    private double price;

    public Ticket(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
        this.watchers = new HashSet<>();
    }

    public void changePrice(double percentage) {
        if (percentage < 1) {
            System.out.println(" * Price is dropping ["+String.format("%.2f",percentage)+"]!");
        } else {
            System.out.println(" * Price is increasing ["+String.format("%.2f",percentage)+"]!");
        }
        this.price = this.price * percentage;
        broadcast();
    }

    public double getPrice() { return this.price; }

    @Override
    public String toString() {
        return "  Ticket { from='" + from + '\'' + ", to='" + to + '\''
                + ", price=" + String.format("%.2f",price) + " }";
    }

    /************************
     ** Watching Mechanism **
     ************************/

    private Set<Watcher> watchers;
    public void register(Watcher w) {
        System.out.println("  "+w.getName()+" is now watching this " + from + " -> " + to+" flight ["+w.getClass().getSimpleName()+"].");
        this.watchers.add(w);
    }

    public void unregister(Watcher w) {
        System.out.println("  "+w.getName()+" is not watching anymore the " + from + " -> " + to+" flight.");
        this.watchers.remove(w);
    }

    private void broadcast() {
        Set<Watcher> targets = new HashSet<>(this.watchers);
        targets.parallelStream().forEach(Watcher::update);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket that = (Ticket) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(from, that.from) &&
                Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() { return Objects.hash(from, to, price); }

}
