package context;

import comparators.CheapestOne;
import comparators.PriceComparison;

import java.util.List;

public class RecommendationEngine {

    private PriceComparison comparator = new CheapestOne();

    public void changeComparisonMode(PriceComparison comparator) {
        this.comparator = comparator;
    }

    public Integer recommend(List<Integer> input) {
        if (input.isEmpty())
            throw new IllegalArgumentException("Imput cannot be empty");
        return comparator.compare(input);
    }

}
