import java.io.*;
import java.util.*;

public abstract class SpotifyList {
    private String listName;
    private String listType;
    private ArrayList<Song> songsList;

    public SpotifyList(String listName, String listType, ArrayList<Song> songsList) {
        this.listName = listName;
        this.listType = listType;
        
    }

    public int getNumSongs() {
        return songsList.size();
    }

    public ArrayList<Song> getSongsList() {
        return this.songsList;
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

    public abstract void getInfo();

    

}

