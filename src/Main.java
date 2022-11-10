import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Song familyTies = new Song("Family Ties", new String[]{"Baby Keem", "Kendrick Lamar"}, 1000000);
        

        Song issues = new Song("issues", "Baby Keem", 50000);

        Song duragActivity = new Song("durag activity", new String[] {"Baby Keem", "Travis Scott"}, 100);

        SpotifyList melodicBlue = new CreatorList("The Melodic Blue", new Song[] {familyTies, issues, duragActivity} , "Baby Keem");


        melodicBlue.getInfo();


        SpotifyList dawnFM = new CreatorList("Dawn FM", "The Weeknd");

        dawnFM.addSong(new Song("song", "The Weeknd", 100));

        dawnFM.getInfo();

        SpotifyList myPlayList = new UserList("my playlist", "user1", "June 20, 2021");

        myPlayList.addSong(duragActivity);
        myPlayList.addSong(1, issues);

        myPlayList.getInfo();
  

    }
}
