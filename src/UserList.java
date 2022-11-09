import java.io.*;
import java.util.*;

public class UserList extends SpotifyList{
    private String user;

    public UserList(String listName, String creator, String listType, ArrayList<Song> songsList) {
        super(listName, creator, listType);
        this.user = creator;
        this.songsList = songsList;
    }


    public String getUser() {
        return this.user;
    }

    
}