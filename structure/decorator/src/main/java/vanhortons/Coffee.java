package vanhortons;

public abstract class Coffee implements Beverage {

    @Override
    public String toString() { return this.getClass().getSimpleName(); }
}
