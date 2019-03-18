package comparators;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ClosestToAverage implements PriceComparison {

    @Override public Integer compare(List<Integer> data) {
        double avg = data.stream().mapToInt((x) -> x).summaryStatistics().getAverage();
        Integer closest = Integer.MIN_VALUE;
        double distance = Double.MAX_VALUE;
        for(Integer i: data) {
            if(Math.abs(i-avg) < distance) {
                closest = i;
                distance = Math.abs(i-avg);
            }
        }
        return  closest;
    }

}
