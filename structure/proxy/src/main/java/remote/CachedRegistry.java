package remote;

import java.util.HashMap;
import java.util.Map;

public class CachedRegistry  implements Registry {

    private Registry target;
    private Map<String, String> cached;

    public CachedRegistry(Registry r) {
        this.target = r;
        this.cached = new HashMap<>();
    }

    @Override
    public String getPhoneNumber(String person) {
        if(! cached.containsKey(person))
            cached.put(person, target.getPhoneNumber(person));
        return cached.get(person);
    }

}
