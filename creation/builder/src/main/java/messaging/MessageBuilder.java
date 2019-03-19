package messaging;

import java.util.List;

public interface MessageBuilder {

    void addRecipient(String r);
    void addContents(String c);

    List<Message> assemble();


}
