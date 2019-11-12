package smarthome;

public class SmartDoor {

    private String name;
    private boolean isOpen = true;

    public SmartDoor(String name) {
        this.name = name;
    }

    public void close() {
        this.isOpen = false;
    }

    public void open() {
        this.isOpen = true;
    }

    @Override
    public String toString() {
        return "SmartLight{" +
                "name='" + name + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
