package auction;

import bidders.Bidder;

import java.util.HashMap;
import java.util.Map;

public abstract class Item {

    private Map<String, Bidder> bidders = new HashMap<>();

    public void register(Bidder b) { bidders.put(b.getName(), b); }
    public void quit(Bidder b)     { bidders.remove(b.getName()); }

    protected void broadcast() {
        bidders.values().parallelStream().forEach(Bidder::update) ;
    }

}
