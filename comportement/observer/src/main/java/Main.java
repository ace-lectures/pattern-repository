import auction.ConcreteItem;
import bidders.Bidder;
import bidders.NoLimit;
import bidders.WithMaxAmount;

public class Main {

  public static void main(String[] args) {
    System.out.println("## Creating a product");
    ConcreteItem anItem = new ConcreteItem(150.0, "i");
    System.out.println(anItem);

    System.out.println("## filling the set of bidders");
    Bidder noLimit = new NoLimit(anItem, "Alice", 120.0);
    Bidder withLimit1 = new WithMaxAmount(anItem, "Bob", 65.0, 1200.0);
    Bidder withLimit2 = new WithMaxAmount(anItem, "Bob", 65.0, 1200.0);



  }

}
