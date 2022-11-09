import java.io.*;
import java.util.*;

public class CreatorList extends SpotifyList{
    private ArrayList<Song> songsList;
    private String artist;

    public CreatorList(String listName, String artist, ArrayList<Song> songsList) {
        super(listName, "Album", songsList);
        this.artist = artist;
    }

    public CreatorList(String listName, String artist, Song song) {
        super(listName, "Single", makeSingleIntoList(song));
        this.artist = artist;
    }

    public static ArrayList<Song> makeSingleIntoList (Song song) {
        ArrayList<Song> singleSong = new ArrayList<>();
        singleSong.add(song);

        return singleSong;
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