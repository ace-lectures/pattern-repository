package auction;

public class ConcreteItem extends Item {

    private double price;
    public double getPrice() { return price; }

    private String name;
    public String getName() { return name; }

    public ConcreteItem(double p, String s) {
        this.price = p;
        this.name = s;
    }

    public void increasePrice(double difference) {
        if (difference < 0)
            throw new IllegalArgumentException();
        this.price += difference;
        this.broadcast();
    }

    @Override public String toString() { return name + " = $"+String.format("%10.2f",price); }
}
