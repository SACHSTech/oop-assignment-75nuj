package Spotify;
import java.io.*;
import java.util.*;

public class Song {
    private String songName;
    private ArrayList<String> artists;
    private int plays;

    /**
     * Constructor when there are multiple artists on a song
     * @param songName
     * @param artists
     * @param plays
     */
    public Song(String songName, String[] artists, int plays) {
        this.songName = songName;
        this.artists = loopThroughArtists(artists);
        this.plays = plays;
    }

    /**
     * Constructor when there is one artist on song
     * @param songName
     * @param artists
     * @param plays
     */
    public Song(String songName, String artists, int plays) {
        this.songName = songName;
        ArrayList<String> artist = new ArrayList<>();
        artist.add(artists);
        this.artists = artist;
        this.plays = plays;
    }

    /**
     * turns array into arraylist for artists
     * @param artists
     * @return returns 
     */

    public static ArrayList<String> loopThroughArtists(String[] artists) {
        ArrayList<String> artistsList = new ArrayList<>();

        for (int i = 0; i < artists.length; i++) {
            artistsList.add(artists[i]);
        }

        return artistsList;
    }

    /**
     * add artist to song
     * @param artist
     */
    public void addArtist(String artist) {
        artists.add(artist);
    }

    /**
     * Getter method for song name 
     * @return songName
     */
    public String getSongName() {
        return this.songName;
    }

    /**
     * return string including list of artists
     * @return returnString
     */
    public String getArtists() {
        String returnString = "";

        for (String artist : this.artists) {
            returnString += artist;
        }

        return returnString;
    }

    /**
     * Getter method for plays from song
     * @return plays
     */
    public int getPlays() {
        return this.plays;
    }

    /**
     * setter method for plays of song
     * @param plays 
     */
    public void setPlays(int plays) {
        this.plays = plays;
    }

    /**
     * to string method
     * @param 
     */
    public String toString() {
        return "(" + songName + ": " + artists + ")";
    }
   

    
}
