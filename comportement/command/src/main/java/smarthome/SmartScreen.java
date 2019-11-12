package smarthome;

public class SmartScreen {

    private boolean isUp = false;

    public SmartScreen() {
    }

    public void up() {
        this.isUp = true;
    }

    public void down() {
        this.isUp = false;
    }

    @Override
    public String toString() {
        return "SmartScreen{" +
                "isUp=" + isUp +
                '}';
    }

}
