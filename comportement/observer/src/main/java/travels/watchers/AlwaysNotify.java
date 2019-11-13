package travels.watchers;

import travels.domain.Ticket;

public class AlwaysNotify extends TicketWatcher {

    public AlwaysNotify(String n, Ticket t) { super(n,t); }

    @Override
    public void update() {
        super.update();
        System.out.println("  -->> Sending email notification");
    }

}
