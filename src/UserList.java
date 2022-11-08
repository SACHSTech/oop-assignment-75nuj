import java.io.*;
import java.util.*;

public class UserList extends SpotifyList{
    private ArrayList<Song> songsList;
    private String user;

    public UserList(String listName, String creator, String listType, ArrayList<Song> songsList) {
        super(listName, creator, listType);
        this.user = creator;
        this.songsList = songsList;
    }

    public int getNumSongs() {
        return songsList.size();
    }

    public String getUser() {
        return this.user;
    }

    public ArrayList<Song> getSongsList() {
        return this.songsList;
    }

}