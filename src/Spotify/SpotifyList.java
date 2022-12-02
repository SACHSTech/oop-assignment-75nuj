package Spotify;
import java.io.*;
import java.util.*;

public abstract class SpotifyList {
    private String listName;
    private String listType;
    private ArrayList<Song> songsList;

    /**
     * constructor without songlist arraylist
     * @param listName
     */
    public SpotifyList(String listName) {
        this.listName = listName;
        this.songsList = new ArrayList<>();
    }

    /**
     * constructor with songlist arraylist initialized
     * @param listName
     * @param listType
     */
    public SpotifyList(String listName, String listType) {
        this.listName = listName;
        this.listType = listType;
        this.songsList = new ArrayList<>();
    }

    /**
     * constructor while inputting songlists
     * @param listName
     * @param songsList
     * @param listType
     */
    public SpotifyList(String listName, ArrayList<Song> songsList, String listType) {
        this.listName = listName;
        this.listType = listType;
        this.songsList = songsList;
        
    }

    /**
     * return number of songs in songlist
     * @return size of songlist arraylist
     */

    public int getNumSongs() {
        try {
            return songsList.size();
        } catch (Exception e) {
            return 0;
        }
        
    }

    /**
     * getter method for name of list
     * @return name of list
     */

    public String getListName() {
        return this.listName;
    }

    /**
     * getter method with type of list
     * @return type of list
     */    
    public String getListType() {
        return this.listType;
    }

    //to string method
    public String toString() {
        return listType + ": " + listName + " contains " + this.getNumSongs() + " song(s).";
    }

    /**
     * getter method for list of songs
     * @return arraylist of songs
     */
    public ArrayList<Song> getSongsList() {
        return this.songsList;
    }

   /**
    * add song to position in list
    * @param songOrder
    * @param song
    */
    public void addSong(int songOrder, Song song) {
        songsList.add(songOrder - 1, song);

        if (songsList.size() > 1) {
            this.listType = "Album";
        } else if(songsList.size() == 1) {
            this.listType = "Single";
        }
    }

    /**
     * add song to list
     * @param song
     */
    public void addSong(Song song) {
        songsList.add(song);

        if (songsList.size() > 1) {
            this.listType = "Album";
        } else if(songsList.size() == 1) {
            this.listType = "Single";
        }
    }

    /**
     * turns array of songs into arraylist of songs
     * @param song
     * @return arraylist of songs 
     */
    public static ArrayList<Song> loopThroughSongs(Song[] song) {
        ArrayList<Song> defaultSongs = new ArrayList<>();

        for (int i = 0; i < song.length; i++) {
            defaultSongs.add(song[i]);
        }
        return defaultSongs;
    }

    //abstract method for getting info on songs
    public abstract void getInfo();

    

}

