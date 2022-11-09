import java.io.*;
import java.util.*;

public class CreatorList extends SpotifyList{
    private ArrayList<Song> songsList;
    private String listCreator;

    public CreatorList(String listName, String listType, String listCreator) {
        super(listName, listType, defaultSongList());
        this.listCreator = listCreator;
    }

    public static ArrayList<Song> defaultSongList() {
        ArrayList<Song> defaultSongs = new ArrayList<>();
        return defaultSongs;
    }

  


    public String getListCreator() {
        return this.listCreator;
    }

    public int totalPlays() {
        int plays = 0;
        for(Song song : songsList) {
            plays += song.getPlays();
        }

        return plays;
    }

    public int averagePlays() {
        double plays = (double) this.totalPlays();
        double numSongs = (double) this.getNumSongs();

        return (int) (plays/numSongs);
    }

    public void updatePlays(int songNum, int newPlays) {
        this.songsList.get(songNum).setPlays(newPlays);
    }

    public void getInfo() {
        System.out.println("Tracklist: ");

        for(int i = 0; i < getSongsList().size(); i++) {
            System.out.print(i + ": ");
            System.out.println(getSongsList().get(i));
        }

        System.out.println("");

        System.out.println("By Artist: " + this.artist);
        System.out.println("Average Plays: " + averagePlays());
    }

    

        

    
}