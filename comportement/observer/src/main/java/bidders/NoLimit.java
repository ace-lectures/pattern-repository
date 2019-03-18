package bidders;

import auction.ConcreteItem;

public class NoLimit extends Bidder {

    public NoLimit(ConcreteItem i, String n, double s) {
        super(i,n,s);
    }


    @Override
    public void decide() {
        this.item.increasePrice( auctionStep);
    }

}
