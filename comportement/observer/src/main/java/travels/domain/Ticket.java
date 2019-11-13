package travels.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ticket {

    protected String from;
    protected String to;
    private double price;

    public Ticket(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public void changePrice(double percentage) {
        if (percentage < 1) {
            System.out.println(" * Price is dropping ["+String.format("%.2f",percentage)+"]!");
        } else {
            System.out.println(" * Price is increasing ["+String.format("%.2f",percentage)+"]!");
        }
        this.price = this.price * percentage;
    }

    public double getPrice() { return this.price; }

    @Override
    public String toString() {
        return "  Ticket { from='" + from + '\'' + ", to='" + to + '\''
                + ", price=" + String.format("%.2f",price) + " }";
    }

}
