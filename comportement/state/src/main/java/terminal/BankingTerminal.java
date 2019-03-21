package banking;

public class BankingTerminal {

    private TerminalState state;
    private double batteryLevel;

    public void setBatteryLevel(double value) {
        this.batteryLevel = value;
        this.state = state.decide(value);
    }

    public void makePayment(String creditCard, double value) {
        this.state.performPayment(creditCard, value);
    }

}
