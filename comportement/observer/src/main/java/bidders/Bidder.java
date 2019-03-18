package bidders;

import auction.ConcreteItem;

public abstract class Bidder {

    private String name;
    public String getName() { return name; }

    protected ConcreteItem item;
    protected double itemPrice;
    protected double auctionStep;

    public Bidder(ConcreteItem item, String name, double step) {
        this.item = item;
        this.itemPrice = item.getPrice();
        this.auctionStep = step;
        this.item.register(this);
    }

    public void update() {
        System.out.println("["+name+"] is updating");
        this.itemPrice = item.getPrice();
    }

    public abstract void decide();

}
