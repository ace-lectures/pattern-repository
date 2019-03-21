package terminal;

import bank.Transaction;

import java.util.HashSet;
import java.util.Set;

public class Offline extends TerminalStatus {


    public Offline(BankingTerminal owner) { super(owner); }


    private Set<Transaction> stored = new HashSet<>();

    @Override
    public void performPayment(String creditCard, double value) {
        if (value > 50.0)
            throw new IllegalArgumentException("Offline payment too risky for ["+value+"]");
        stored.add(new Transaction(creditCard, value));
    }

    @Override
    public void destruct() {
        super.destruct();
        stored.forEach(owner.getBank()::perform); }
    
}
