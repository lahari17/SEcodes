package Assignment6;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.*;

class ChatServer {
    private List<User> users;
    private Map<String, List<Message>> messageHistory;
    private Map<String, Set<String>> blockedUsers;

    public ChatServer() {
        users = new ArrayList<>();
        messageHistory = new HashMap<>();
        blockedUsers = new HashMap<>();
    }

    public void registerUser(User user) {
        users.add(user);
        messageHistory.put(user.getUsername(), new ArrayList<>());
    }

    public void unregisterUser(User user) {
        users.remove(user);
        messageHistory.remove(user.getUsername());
    }

    public void sendMessage(Message message) {
        for (String recipient : message.getRecipients()) {
            if (!isBlocked(recipient, message.getSender())) {
                messageHistory.get(recipient).add(message);
            }
        }
        System.out.println("Message sent: [" + message.getFormattedTimestamp() + "] " + message.getSender() + " to " + message.getRecipients() + ": " + message.getContent());
    }

    public void removeMessage(Message message) {
        for (String recipient : message.getRecipients()) {
            messageHistory.get(recipient).remove(message);
        }
    }

    public void blockMessages(String blocker, String blockee) {
        blockedUsers.computeIfAbsent(blockee, k -> new HashSet<>()).add(blocker);
    }

    private boolean isBlocked(String recipient, String sender) {
        Set<String> blocked = blockedUsers.getOrDefault(recipient, Collections.emptySet());
        return blocked.contains(sender);
    }
}
