package travels;

public interface Watchable {

    void attach(Watcher w);
    void detach(Watcher w);
    void broadcast();

}
