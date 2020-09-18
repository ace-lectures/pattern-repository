package travels;

public class LeaveWhenTooExpensive extends Watcher {

    private double threshold;

    public LeaveWhenTooExpensive(String n, Ticket t, double percentage) {
        super(n,t);
        this.threshold = t.getPrice() * percentage;
    }

    @Override
    public void update() {
        super.update();
        if(this.ticket.getPrice() < threshold)
            System.out.println("  ->> Sending email notification, price is still correct");
        else {
            System.out.println("  ->> too expensive, not interested anymore");
            this.ticket.unregister(this);
        }
    }

}
