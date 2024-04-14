package Models;

import Enums.Genre;

import java.util.List;

public class Song {
    private String name;
    private Integer durations;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song() {
    }

    public Song(String name, Integer durations, Genre genre, Album album, Artist artist) {
        this.name = name;
        this.durations = durations;
        this.genre = genre;
        this.album = album;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurations() {
        return durations;
    }

    public void setDurations(Integer durations) {
        this.durations = durations;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtists() {
        return artist;
    }

    public void setArtists(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
