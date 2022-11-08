import java.io.*;
import java.util.*;

public class CreatorList extends SpotifyList{
    private ArrayList<Song> songsList;
    private String artist;

    public CreatorList(String listName, String creator, String listType) {
        super(listName, creator, listType);
    }

    public void addSong(String songName, ArrayList <String> artists, int numPlays, int songOrder) {
        songsList.add(songOrder, new Song(songName, artists, numPlays));
    }

    public int getNumSongs() {
        return songsList.size();
    }

    public String getArtist() {
        return this.artist;
    }

    public void

        

    
}