package travels;

public class AlwaysNotify extends Watcher {

    public AlwaysNotify(String n, Ticket t) { super(n,t); }

    @Override
    public void update() {
        super.update();
        System.out.println("  -->> Sending email notification");
    }

}
