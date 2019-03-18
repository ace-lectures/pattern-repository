package bidders;

import auction.ConcreteItem;

public class WithMaxAmount extends Bidder {

    private double max;


    public WithMaxAmount(ConcreteItem i, String n, double s, double m) {
        super(i,n,s);
        this.max = m;
    }


    @Override
    public void decide() {
        if (this.itemPrice > max)
            this.item.quit(this);
        else
            this.item.increasePrice( auctionStep);
    }

}
