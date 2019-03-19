package messaging;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SMSBuilder implements MessageBuilder {

    private Set<String> recipients = new HashSet<>();
    private String contents = null;

    @Override public void addRecipient(String r) { this.recipients.add(r); }

    @Override public void addContents(String c) { this.contents = c; }

    @Override
    public List<Message> assemble() {
        if (recipients.isEmpty() || contents == null)
            throw new IllegalStateException();
        return recipients.stream()
                .map((r) -> new SMS(r,contents))
                .collect(Collectors.toList());
    }
}
