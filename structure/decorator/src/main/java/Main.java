import vanhortons.Beverage;
import vanhortons.coffees.*;
import vanhortons.addons.*;

public class Main {

  public static void main(String[] args) {

    System.out.println("# Selling plain coffees");
    displayBeverage(new Regular());
    displayBeverage(new Fancy());

    System.out.println("\n# Adding extras");
    displayBeverage(new SoyMilk(new Regular()));
    displayBeverage(new ExpressoShot(new Fancy()));
    displayBeverage(new SoyMilk(new ExpressoShot(new Fancy())));
    displayBeverage(new ExpressoShot(new ExpressoShot(new Regular())));

    System.out.println("\n# Messing up with discounts (aka order matters)");
    displayBeverage(new Discount(new Regular()));
    displayBeverage(new Discount(new ExpressoShot(new Regular())));
    displayBeverage(new ExpressoShot(new Discount(new Regular())));

  }

  private static void displayBeverage(Beverage b) {
    System.out.println(b + ": $"+String.format("%.2f", b.getPrice()));
  }

}
