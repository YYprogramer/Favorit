package com.youtuber.Favorit;

public class Youtuber {
    private final String name;
    private final String genre;

    public Youtuber(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
