import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Song familyTies = new Song("FamilyTies", new String[]{"Baby Keem", "Kendrick Lamar"}, 1000000);
        

        Song issues = new Song("issues", new String[] {"Baby Keem"} , 50000);

        Song duragActivity = new Song("durag activity", new String[] {"Baby Keem", "Travis Scott"}, 100);

        SpotifyList melodicBlue = new CreatorList("The Melodic Blue", new Song[] {familyTies, issues, duragActivity} , "Baby Keem");


        melodicBlue.getInfo();

    }
}
