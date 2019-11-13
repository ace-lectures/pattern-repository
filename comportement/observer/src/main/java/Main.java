import travels.domain.Ticket;
import travels.watchers.AlwaysNotify;
import travels.watchers.LeaveWhenTooExpensive;
import travels.watchers.NotifyPriceDrop;
import travels.watchers.NotifyPriceRise;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("# Creating Flight tickets");
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("YUL", "NYC", 413.45));
        tickets.add(new Ticket("YUL", "BGI", 847.86));
        tickets.add(new Ticket("YUL", "NCE", 655.21));
        tickets.forEach(System.out::println);


        System.out.println("\n# Registering Observers");
        tickets.forEach((t) -> {
            new AlwaysNotify("Bob", t);
            new NotifyPriceDrop("Eve", t);
            new NotifyPriceRise("Pat", t);
            new LeaveWhenTooExpensive("Joe", t, 1.15);
        });

        System.out.println("\n# Running the pricing engine to mess with the tickets");
        int howManyChanges = 10;
        int round = 0;
        Random rand = new Random();
        while (round < howManyChanges) {
            Ticket t = tickets.get(rand.nextInt(tickets.size()));
            System.out.println("\n## Round "+ round + ": " + t.toString());
            double percentage = 0.75 + (rand.nextDouble()*1.25);
            t.changePrice(percentage);
            round++;
        }

        System.out.println("\n# End of simulation");

    }

}
