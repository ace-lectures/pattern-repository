package travels;

public class NotifyPriceRise extends Watcher {

    private double lastPrice;

    public NotifyPriceRise(String n, Ticket t) { super(n,t); this.lastPrice = t.getPrice(); }

    @Override
    public void update() {
        super.update();
        if(this.ticket.getPrice() > lastPrice)
            System.out.println("  ->> Sending email notification, price is going up");
        this.lastPrice = this.ticket.getPrice();
    }

}
