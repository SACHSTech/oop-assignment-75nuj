import java.io.*;
import java.util.*;

public class CreatorList extends SpotifyList{
    private ArrayList<Song> songsList;
    private String artist;

    public CreatorList(String listName, String creator, String listType, ArrayList<Song> songsList) {
        super(listName, creator, listType);
        this.artist = creator;
        this.songsList = songsList;
    }

    public void addSong(String songName, ArrayList <String> artists, int numPlays, int songOrder) {
        songsList.add(songOrder, new Song(songName, artists, numPlays));
    }

    public String getArtist() {
        return this.artist;
    }

    public int totalPlays() {
        int plays = 0;
        for(Song song : songsList) {
            plays += song.getPlays();
        }

        return plays;
    }

    public int averagePlays() [
        double plays = (double) this.totalPlays();
        double numSongs = (double) this.getNumSongs();

        return (int) (plays/numSongs);
    ]

    

        

    
}