package Assignment7.Question2;

import java.util.List;

// Interface for SongService
public interface SongService {
    Song searchById(Integer songID);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
}
