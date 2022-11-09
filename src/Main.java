import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SpotifyList melodicBlue = new CreatorList("The Melodic Blue", "Album", "Baby Keem");
        
        Song familyTies = new Song("FamilyTies", "Baby Keem", 1000000);
        familyTies.addArtist("Kendrick Lamar");

        Song issues = new Song("issues", "Baby Keem", 50000);

        Song duragActivity = new Song("durag activity", "Baby Keem ", 100);
        duragActivity.addArtist("Travis Scott");

        melodicBlue.addSong(1, familyTies);
        melodicBlue.addSong(2, issues);
        melodicBlue.addSong(2, duragActivity);

        melodicBlue.getInfo();

    }
}
