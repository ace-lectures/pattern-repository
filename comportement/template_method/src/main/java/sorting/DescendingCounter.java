package sorting;

import java.util.Collections;

import static java.util.Map.Entry.comparingByValue;

public class DescendingCounter extends OccurencyCounter {

    public DescendingCounter(String input) { super(input); }

    @Override protected void display() {
        this.counter.entrySet().stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .forEach((e) -> System.out.println("  " + e));
    }
}
