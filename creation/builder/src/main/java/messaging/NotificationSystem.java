package messaging;

import java.util.*;

public class NotificationSystem {

    private Map<String, MessageBuilder> userPreferences = new HashMap<>();
    private Set<String> customerDatabase = new HashSet<>();

    public NotificationSystem() {
        this.userPreferences.put("AmazonPrime", new SMSBuilder());
        this.userPreferences.put("Netflix", new EmailBuilder());
        this.customerDatabase.add("Bob");
        this.customerDatabase.add("Alice");
        this.customerDatabase.add("Eve");
    }

    public void runCampaign(String company, String message) {
        MessageBuilder builder = userPreferences.getOrDefault(company, new EmailBuilder());
        for(String customer: customerDatabase)
            builder.addRecipient(customer);
        builder.addContents(message);
        sendMessages(builder.assemble());
    }

    private void sendMessages(List<Message> messages) {
        for(Message m: messages)
            m.send();
    }

}
