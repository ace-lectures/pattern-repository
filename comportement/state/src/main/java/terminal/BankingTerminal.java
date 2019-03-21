package terminal;

import bank.Bank;

public class BankingTerminal {

    private Bank bank = new Bank();
    public Bank getBank() { return bank; }

    public void connect() { this.setStatus(new Online(this)); }
    public void disconnect() { this.setStatus(new Offline(this)); }

    private void setStatus(TerminalStatus newStatus) {
        this.status.destruct();
        this.status = newStatus;
    }

    private TerminalStatus status = new Online(this);

    public void makePayment(String creditCard, double value) {
        System.out.println("  Performing payment ["+value+"]");
        this.status.performPayment(creditCard, value);
    }

}
