package com.swagmusic.swag.implementations;

import java.util.List;
import java.util.ArrayList;

public class Recommendation implements interfaces.Recommendation {
    private ArrayList<Track> tracks;
    public Recommendation(Iterable<Track> tracksToAdd)
    {
        tracks = new ArrayList<>();
        for(Track t : tracksToAdd)
            tracks.add(t);
    }

    @Override
    public List<Track> getTracks() {
        return tracks;
    }
}
