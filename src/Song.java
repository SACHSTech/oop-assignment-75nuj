import java.io.*;
import java.util.*;

public class Song {
    private String songName;
    private ArrayList<String> artists;
    private int plays;

    public Song(String songName, String[] artists, int plays) {
        this.songName = songName;
        this.artists = loopThroughArtists(artists);
        this.plays = plays;
    }

    public Song(String songName, String artists, int plays) {
        this.songName = songName;
        ArrayList<String> artist = new ArrayList<>();
        artist.add(artists);
        this.artists = artist;
        this.plays = plays;
    }

    public static ArrayList<String> loopThroughArtists(String[] artists) {
        ArrayList<String> defaultSongs = new ArrayList<>();

        for (int i = 0; i < artists.length; i++) {
            defaultSongs.add(artists[i]);
        }

        return defaultSongs;
    }

    public void addArtist(String artist) {
        artists.add(artist);
    }

    public String songName() {
        return this.songName;
    }

    public String getArtists() {
        String returnString = "";

        for (String artist : this.artists) {
            returnString += artist;
        }

        return returnString;
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
