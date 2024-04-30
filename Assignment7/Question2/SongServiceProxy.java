package Assignment7.Question2;

// Proxy implementation of SongService
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceProxy implements SongService {
    private final SongService realServer;
    private final Map<Integer, Song> songCache;

    public SongServiceProxy(SongService realServer) {
        this.realServer = realServer;
        this.songCache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        // Check if the song metadata is already in the cache
        if (songCache.containsKey(songID)) {
            System.out.println("Retrieving song metadata from cache...");
            return songCache.get(songID);
        } else {
            // Fetch song metadata from the real server
            Song song = realServer.searchById(songID);
            // Cache the song metadata
            songCache.put(songID, song);
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // Implement caching logic similar to searchById method
        return realServer.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // Implement caching logic similar to searchById method
        return realServer.searchByAlbum(album);
    }
}

