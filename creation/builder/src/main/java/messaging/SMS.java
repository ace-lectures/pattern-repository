package messaging;

public class SMS implements Message {

    private String recipient;
    private String message;

    public SMS(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String toString() { return "SMS { recipient='" + recipient + '\'' + ", message='" + message + "\' }"; }

    @Override public void send() { System.out.println(this); }

}
