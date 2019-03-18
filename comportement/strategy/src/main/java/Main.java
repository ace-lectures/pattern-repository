import comparators.ClosestToAverage;
import context.RecommendationEngine;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    System.out.println("## Building a Recommendation Engine");
    RecommendationEngine engine = new RecommendationEngine();


    System.out.println("## Asking the engine to recommend a price");
    System.out.println("  ==> "+ engine.recommend(data));

    System.out.println("## Changing the recommendation strategy");
    engine.changeComparisonMode(new ClosestToAverage());

    System.out.println("## Asking the engine to recommend a price");
    System.out.println("  ==> "+ engine.recommend(data));

  }

}
