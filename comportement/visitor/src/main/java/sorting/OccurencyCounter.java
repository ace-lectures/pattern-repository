package sorting;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class OccurencyCounter {

    private String data;

    protected Map<String, Integer> counter;

    public OccurencyCounter(String input) {
        this.data = input;
        this.counter = new HashMap<>();
    }

    public void handle() {
        preprocess();
        count();
        display();
        postprocess();
    }

    private void preprocess() {
        System.out.println("Preprocessing data");
        this.data = this.data.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
    }

    private void count() {
        System.out.println("Counting word occurencies");
        for(String w: data.split("\\s+")) {
            counter.put(w,counter.getOrDefault(w,0)+1);
        }
    }

    protected abstract void display();

    private void postprocess() {
        System.out.println("Found ["+counter.size()+"] distinct words");
    }


}
