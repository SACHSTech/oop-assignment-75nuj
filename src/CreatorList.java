import java.io.*;
import java.util.*;

public class CreatorList extends SpotifyList{
    private String listCreator;


    public CreatorList(String listName, Song[] songs, String listCreator) {
        super(listName, loopThroughSongs(songs), (songs.length > 1) ? "Album" : "Single");
        this.listCreator = listCreator;
    }

    public CreatorList(String listName, String listCreator) {
        super(listName);
        this.listCreator = listCreator;
    }


    public String getListCreator() {
        return this.listCreator;
    }

    public int totalPlays() {
        int plays = 0;
        for(Song song : getSongsList()) {
            plays += song.getPlays();
        }

        return plays;
    }

    public double averagePlays() {
        double plays = (double) this.totalPlays();
        double numSongs = (double) this.getNumSongs();

        return (plays/numSongs);
    }

    public void updatePlays(int songNum, int newPlays) {
        getSongsList().get(songNum).setPlays(newPlays);
    }

    public void getInfo() {
        System.out.println("Tracklist: " + "[" + this.getListName() + "]");

        for(int i = 0; i < getSongsList().size(); i++) {
            System.out.print((i + 1) + ": ");
            System.out.println(getSongsList().get(i));
        }

        System.out.println("");

        System.out.println("By Artist: " + this.listCreator);
        System.out.println("Average Plays: " + averagePlays());
        System.out.println();
    }

    

        

    
}