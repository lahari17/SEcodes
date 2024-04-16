package Assignment6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ChatHistory implements Iterable<Message> {
    private List<Message> messages;

    public ChatHistory() {
        messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void removeMessage(Message message) {
        messages.remove(message);
    }

    public Iterator<Message> iterator() {
        return messages.iterator();
    }
}