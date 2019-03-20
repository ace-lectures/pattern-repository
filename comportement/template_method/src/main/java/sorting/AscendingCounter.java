package sorting;

import static java.util.Map.Entry.comparingByValue;

public class AscendingCounter extends OccurencyCounter {

    public AscendingCounter(String input) { super(input); }

    @Override protected void display() {
        this.counter.entrySet().stream()
                .sorted(comparingByValue())
                .forEach((e) -> System.out.println("  " + e));
    }
}
