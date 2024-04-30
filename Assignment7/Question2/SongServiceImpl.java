package Assignment7.Question2;

import java.util.ArrayList;
import java.util.List;

// Implementation of SongService
public class SongServiceImpl implements SongService {
    private final List<Song> songs;

    public SongServiceImpl(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public Song searchById(Integer songID) {
        // Simulate delay
        simulateDelay();
        for (Song song : songs) {
            if (song.getId().equals(songID)) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // Simulate delay
        simulateDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // Simulate delay
        simulateDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }

    // Simulate delay of 1 second
    private void simulateDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

