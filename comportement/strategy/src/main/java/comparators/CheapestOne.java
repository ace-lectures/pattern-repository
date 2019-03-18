package comparators;

import java.util.Collections;
import java.util.List;

public class CheapestOne implements PriceComparison {

    @Override public Integer compare(List<Integer> data) {
        return Collections.min(data);
    }

}
