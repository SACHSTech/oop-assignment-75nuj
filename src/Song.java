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

    public String songName() {
        return this.songName;
    }

    public ArrayList<String> getArtists() {
        return this.artists;
    }

    public int getPlays() {
        return this.plays;
    }
   

    

    
}
