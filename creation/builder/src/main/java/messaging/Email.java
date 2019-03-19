package messaging;

import java.util.Arrays;
import java.util.Collections;

public class Email implements Message {

    private String[] to;
    private String body;

    public Email(String[] to, String body) {
        this.to = to;
        this.body = body;
    }

    @Override public void send() { System.out.println(this); }

    @Override
    public String toString() { return "Email {" + "to=" + Arrays.toString(to) + ", body='" + body + "\' }"; }
}
