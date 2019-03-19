package messaging;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailBuilder implements MessageBuilder {

    private Set<String> recipients = new HashSet<>();
    private String contents = null;

    @Override public void addRecipient(String r) { this.recipients.add(r); }

    @Override public void addContents(String c) { this.contents = c; }

    @Override
    public List<Message> assemble() {
        if (recipients.isEmpty() || contents == null)
            throw new IllegalStateException();
        return Collections.singletonList(new Email(recipients.toArray(new String[0]),contents));
    }
}
