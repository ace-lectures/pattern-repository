package terminal;

public abstract class TerminalStatus {

    protected BankingTerminal owner;

    protected TerminalStatus(BankingTerminal o) {
        System.out.println("\nCreating Status ["+this.getClass().getSimpleName() + "]");
        this.owner = o;
    }

    abstract void performPayment(String creditCard, double value);

    public void destruct() {
        System.out.println("\nDestructing Status ["+this.getClass().getSimpleName() + "]");
    }

}
