package bank;

public class Transaction {

    private String cardNumber;
    private double amount;

    public Transaction(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "cardNumber='" + cardNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
