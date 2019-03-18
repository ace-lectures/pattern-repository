package vanhortons.addons;

import vanhortons.Beverage;
import vanhortons.Extra;

public class SoyMilk  extends Extra {

    public SoyMilk(Beverage inner) { super(inner); }

    @Override protected double extra(double price) { return price + 1.25; }

}