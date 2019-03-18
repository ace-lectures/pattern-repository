package vanhortons.addons;

import vanhortons.Beverage;
import vanhortons.Extra;

public class Discount extends Extra {

    public Discount(Beverage inner) { super(inner); }

    @Override protected double extra(double price) { return price * 0.80; }

}
