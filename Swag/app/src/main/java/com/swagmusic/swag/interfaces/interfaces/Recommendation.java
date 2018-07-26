package interfaces;

import java.util.List;

import com.swagmusic.swag.implementations.Track;

public interface Recommendation {
    List<Track> getTracks();
}
