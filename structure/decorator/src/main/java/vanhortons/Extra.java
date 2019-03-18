package vanhortons;

public abstract class Extra implements Beverage {

    private Beverage component;

    protected Extra(Beverage inner) {
        this.component = inner;
    }

    @Override public double getPrice() { return extra(component.getPrice()); }

    @Override public String toString() { return component.toString() + ", " + this.getClass().getSimpleName(); }

    protected abstract double extra(double price);

}
