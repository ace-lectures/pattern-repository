package travels.watchers;

import travels.domain.Ticket;

public class NotifyPriceDrop extends TicketWatcher {

    private double lastPrice;

    public NotifyPriceDrop(String n, Ticket t) { super(n,t);  this.lastPrice = t.getPrice(); }

    @Override
    public void update() {
        super.update();
        if(this.ticket.getPrice() < lastPrice)
            System.out.println("  ->> Sending email notification, price is going down");
        this.lastPrice = this.ticket.getPrice();
    }

}
