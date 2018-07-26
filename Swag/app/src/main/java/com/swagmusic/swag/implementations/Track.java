package com.swagmusic.swag.implementations;

import java.util.List;

public class Track implements interfaces.Track {

    Track(String name, String uri, String id, List<Artist> artists){
        this.name = name;
        this.uri = uri;
        this.id = id;
        this.artists = artists;
    }

    private String name;
    private String uri;
    private String id;
    private List<Artist> artists;

    public String getName() { return name; }
    public String getUri() { return uri; }
    public String getId() { return id; }

    public List<Artist> getArtists() { return artists; }

}
