package Assignment7.Question2;


import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create sample songs
        List<Song> songs = Arrays.asList(
                new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", 355),
                new Song(2, "Hotel California", "Eagles", "Hotel California", 391),
                new Song(3, "Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV", 482),
                new Song(4, "Imagine", "John Lennon", "Imagine", 184),
                new Song(5, "Hey Jude", "The Beatles", "The Beatles (White Album)", 431)
        );
        // Print all songs
        System.out.println("All Songs:");
        for (Song song : songs) {
            System.out.println(song);
        }
        // Create real server and proxy
        SongService realServer = new SongServiceImpl(songs);
        SongService proxy = new SongServiceProxy(realServer);

        // Search for songs using the proxy
        System.out.println("\nSearching for 'Bohemian Rhapsody' by ID:");
        System.out.println(proxy.searchById(1));

        System.out.println("\nSearching for 'Hotel California' by title:");
        System.out.println(proxy.searchByTitle("Hotel California"));

        System.out.println("\nSearching for songs in 'Imagine' album:");
        System.out.println(proxy.searchByAlbum("Imagine"));
    }
}
