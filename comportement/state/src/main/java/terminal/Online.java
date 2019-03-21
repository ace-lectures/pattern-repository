package terminal;

import bank.Transaction;

public class Online extends TerminalStatus {

    public Online(BankingTerminal owner) { super(owner); }

    @Override
    public void performPayment(String creditCard, double value) {
        owner.getBank().perform(new Transaction(creditCard,value));
    }

}
