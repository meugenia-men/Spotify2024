package Interfaces;

import Models.Song;

import java.util.List;
import java.util.Stack;

public interface Reproduction {
    public Song play();
    public void addSong(Song song);
    public void deleteSong(String title);
    public void showMyList();

}
