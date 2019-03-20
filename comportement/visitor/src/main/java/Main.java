import sorting.AscendingCounter;
import sorting.DescendingCounter;
import sorting.OccurencyCounter;

public class Main {

  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
      + "Maecenas malesuada diam felis, ut consectetur tellus egestas sit amet."
      + "Ut porttitor augue quis felis sollicitudin posuere.";

    System.out.println("\n# Counting word occurencies using an ASC counter");
    OccurencyCounter asc = new AscendingCounter(text);
    asc.handle();

    System.out.println("\n# Counting word occurencies using a DSC counter");
    OccurencyCounter dsc = new DescendingCounter(text);
    dsc.handle();

  }

}
