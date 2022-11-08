import java.io.*;
import java.util.*;

public abstract class SpotifyList {
    private String listName;
    private String creator;
    private String listType;
    private ArrayList<Song> songsList;

    public SpotifyList(String listName, String creator, String listType) {
        this.listName = listName;
        this.creator = creator;
        this.listType = listType;
        
    }

    public int getNumSongs() {
        return songsList.size();
    }

    public ArrayList<Song> getSongsList() {
        return this.songsList;
    }


}

