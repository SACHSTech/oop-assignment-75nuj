import java.io.*;
import java.util.*;

public class Song {
    private String songName;
    private ArrayList<String> artists;
    private int plays;

    public Song(String songName, ArrayList<String> artists, int plays) {
        this.songName = songName;
        this.artists = artists;
        this.plays = plays;
    }

    public Song(String songName, String artist, int plays) {
        ArrayList<String> artists = new ArrayList<>();
        artists.add(artist);
        this.songName = songName;
        this.artists = artists;
    }

    public String songName() {
        return this.songName;
    }

    public ArrayList<String> getArtists() {
        return this.artists;
    }

    public int getPlays() {
        return this.plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    public String toString() {
        return "(" + songName + ": " + artists + ")";
    }
   

    
}
