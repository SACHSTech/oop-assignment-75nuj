import java.io.*;
import java.util.*;

public class UserList extends SpotifyList{
    private String user;

    public UserList(String listName, String creator, Song[] songs) {
        super(listName, loopThroughSongs(songs), "User Playlist");
        this.user = creator;
    }


    public String getUser() {
        return this.user;
    }

    public void getInfo() {
        System.out.println("Songs:" + getSongsList());
        System.out.println("Created by User:" + this.user);
    }


}