package Assignment6;


import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// User class representing a user of the chat application
class User {
    private String username;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Stack<Message> sentMessages;

    public User(String username, ChatServer chatServer) {
        this.username = username;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        this.sentMessages = new Stack<>();
    }

    public void sendMessage(List<String> recipients, String content) {
        Message message = new Message(username, recipients, content);
        chatServer.sendMessage(message);
        chatHistory.addMessage(message);
        sentMessages.push(message);
    }

    public void undoLastMessage() {
        if (!sentMessages.isEmpty()) {
            Message lastMessage = sentMessages.pop();
            chatServer.removeMessage(lastMessage);
            chatHistory.removeMessage(lastMessage);
            System.out.println("User " + username + " undid the last message.");
        } else {
            System.out.println("User " + username + " has no messages to undo.");
        }
    }

    public void blockMessagesFrom(String userToBlock) {
        chatServer.blockMessages(username, userToBlock);
        System.out.println("User " + username + " blocked messages from user " + userToBlock + ".");
    }

    public String getUsername() {
        return username;
    }

    public void displayChatHistory() {
        System.out.println("Chat history for " + username + ":");
        for (Message message : chatHistory) {
            System.out.println("[" + message.getFormattedTimestamp() + "] " + message.getSender() + ": " + message.getContent());
        }
    }
}