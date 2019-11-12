package smarthome;

public class SmartProjector {

    private boolean isOn = false;

    public SmartProjector() {
    }

    public void start() {
        this.isOn = true;
    }

    public void shutdown() {
        this.isOn = false;
    }

    @Override
    public String toString() {
        return "SmartProjector{" +
                "isOn=" + isOn +
                '}';
    }

}
