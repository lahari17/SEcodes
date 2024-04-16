package Assignment6;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.*;

// Message class representing a message sent by a user
class Message {
    private String sender;
    private List<String> recipients;
    private String content;
    private Date timestamp;

    public Message(String sender, List<String> recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
        this.timestamp = new Date();
    }

    // Getters
    public String getSender() {
        return sender;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getFormattedTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(timestamp);
    }
}
