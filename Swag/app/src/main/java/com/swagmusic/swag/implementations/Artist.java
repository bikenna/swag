package com.swagmusic.swag.implementations;

public class Artist implements interfaces.Artist {
    Artist(String name, String uri, String id){
        this.name = name;
        this.uri = uri;
        this.id = id;
    }

    public String getName(){ return name; }
    public String getUri() { return uri; }
    public String getId() { return id; }

    private String name;
    private String uri;
    private String id;
}
