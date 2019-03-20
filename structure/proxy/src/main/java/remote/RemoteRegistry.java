package remote;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RemoteRegistry implements Registry {

    private Map<String, String> contents;

    public RemoteRegistry() {
        this.contents = new HashMap<>();
        contents.put("bob", "514-555-1376");
        contents.put("alice", "438-555-1492");
    }

    public String getPhoneNumber(String person) {
        System.out.println("  --- Remote Call -- Expensive");
        try { TimeUnit.MILLISECONDS.sleep(500); } catch(Exception e) { throw  new RuntimeException(e); }
        return contents.get(person);
    }
}
