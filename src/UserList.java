import java.io.*;
import java.util.*;

public class UserList extends SpotifyList{
    private String user;

    public UserList(String listName, String creator, ArrayList<Song> songsList) {
        super(listName, "User Playlist", songsList);
        this.user = creator;
    }


    public String getUser() {
        return this.user;
    }

    public void getInfo() {
        
    }


}