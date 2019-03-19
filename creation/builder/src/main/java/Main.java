import messaging.NotificationSystem;

public class Main {


  public static void main(String[] args) {

    NotificationSystem notifier = new NotificationSystem();

    System.out.println("\n# Running the Netflix campaign");
    notifier.runCampaign("Netflix", "Umbrella Academy is now available!");

    System.out.println("\n# Running the Amazon Prime campaign");
    notifier.runCampaign("AmazonPrime", "American Gods is now available!");

    System.out.println("\n# Running the HBO campaign");
    notifier.runCampaign("HBO", "Game of Thrones is now available!");

  }

}
