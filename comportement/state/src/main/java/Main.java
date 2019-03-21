import terminal.BankingTerminal;

public class Main {

  private static BankingTerminal terminal;

  public static void main(String[] args) {

    terminal = new BankingTerminal();

    pay("123456", 120.25);
    pay("987654", 12.14);

    terminal.disconnect();

    pay("138965", 12.14);
    pay("683524", 34.51);
    pay("723349", 149.99); // <<== Rejected, too high
    pay("198537", 42.00);

    terminal.connect();

    pay("723349", 149.99); // <<== now it's ok

  }

  private static void pay(String card, double amount) {
    try { terminal.makePayment(card,amount); }
    catch (Exception e) {
      System.out.println("    /!\\ error while processing payment /!\\ ");
      System.out.println("      -->> " + e.getMessage());
    }
  }


}
