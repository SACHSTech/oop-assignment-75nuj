import java.io.*;
import java.util.*;

public abstract class SpotifyList {
    private String listName;
    private String listType;
    private ArrayList<Song> songsList;

    public SpotifyList(String listName) {
        this.listName = listName;
        this.songsList = new ArrayList<>();
    }

    public SpotifyList(String listName, String listType) {
        this.listName = listName;
        this.listType = listType;
        this.songsList = new ArrayList<>();
    }

    public SpotifyList(String listName, ArrayList<Song> songsList, String listType) {
        this.listName = listName;
        this.listType = listType;
        this.songsList = songsList;
        
    }

    public int getNumSongs() {
        return songsList.size();
    }

    public String getListName() {
        return this.listName;
    }
    
    public String getListType() {
        return this.listType;
    }

    public String toString() {
        return "This " + listType + " is named " + listName + " and contains " + this.getNumSongs() + " # of songs.";
    }

    public ArrayList<Song> getSongsList() {
        return this.songsList;
    }

   
    public void addSong(int songOrder, Song song) {
        songsList.add(songOrder - 1, song);

        if (songsList.size() > 1) {
            this.listType = "Album";
        } else if(songsList.size() == 1) {
            this.listType = "Single";
        }
    }

    public void addSong(Song song) {
        songsList.add(song);

        if (songsList.size() > 1) {
            this.listType = "Album";
        } else if(songsList.size() == 1) {
            this.listType = "Single";
        }
    }


    public static ArrayList<Song> loopThroughSongs(Song[] song) {
        ArrayList<Song> defaultSongs = new ArrayList<>();

        for (int i = 0; i < song.length; i++) {
            defaultSongs.add(song[i]);
        }
        return defaultSongs;
    }

    public abstract void getInfo();

    

}

