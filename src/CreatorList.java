import java.io.*;
import java.util.*;

public class CreatorList extends SpotifyList{
    private ArrayList<Song> songsList;
    private String artist;

    public CreatorList(String listName, String creator, String listType) {
        super(listName, creator, listType);
    }

    public void addSong(String songName, ArrayList <String> artists, int songOrder) {
        songsList.add(songOrder, new Song(songName, artists));
    }

    public int getNumSongs() {
        return songsList.size();
    }

    

    
}