package Assignment6;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create chat server
        ChatServer server = new ChatServer();

        // Create users
        User user1 = new User("Alice", server);
        User user2 = new User("Bob", server);
        User user3 = new User("Charlie", server);

        // Register users with the chat server
        server.registerUser(user1);
        server.registerUser(user2);
        server.registerUser(user3);

        // User1 sends a message to user2 and user3
        user1.sendMessage(Arrays.asList("Bob", "Charlie"), "Hello, Bob and Charlie!");

        // User2 sends a message to user1
        user2.sendMessage(Arrays.asList("Alice"), "Hi, Alice!");

        // User1 undoes the last message (Hello, Bob and Charlie!)
        user1.undoLastMessage();

        // User3 blocks messages from user1
        user3.blockMessagesFrom("Alice");

        // User2 sends a message to user1 after user3 blocks messages from user1
        user2.sendMessage(Arrays.asList("Alice"), "I hope you can receive this, Alice!");

        // Print chat history for each user
        System.out.println("\nChat history for each user:");
        user1.displayChatHistory();
        user2.displayChatHistory();
        user3.displayChatHistory();
    }
}