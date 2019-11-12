package smarthome;

public class SmartLight {

    private String name;
    private boolean isOn = false;

    public SmartLight(String name) {
        this.name = name;
    }

    public void switchStatus(boolean status) {
        this.isOn = status;
    }

    @Override
    public String toString() {
        return "SmartLight{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
