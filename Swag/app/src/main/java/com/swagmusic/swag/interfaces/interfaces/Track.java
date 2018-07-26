package interfaces;

import java.util.List;

import com.swagmusic.swag.implementations.Artist;

public interface Track {
    String getName();
    String getUri();
    String getId();
    List<Artist> getArtists();
}
