import java.io.*;
import java.util.*;

public class UserList extends SpotifyList{
    private String user;
    private String creationDate;

    public UserList(String listName, String creator, Song[] songs, String creationDate) {
        super(listName, loopThroughSongs(songs), "User Playlist");
        this.user = creator;
        this.creationDate = creationDate;
    }

    public UserList(String listName, String creator, String creationDate) {
        super(listName, "User Playlist");
        this.user = creator;
        this.creationDate = creationDate;
    }

    public String getUser() {
        return this.user;
    }

    public void getInfo() {
        System.out.println(this.getListName() + ":");

        for(int i = 0; i < getSongsList().size(); i++) {
            System.out.print((i + 1) + ": ");
            System.out.println(getSongsList().get(i));
        }

        System.out.println("Created by User: " + this.user + " on " + this.creationDate);
    }


}