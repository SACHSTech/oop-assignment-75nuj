import java.io.*;
import java.util.*;

public class Main {

    private static boolean isNum(String songNum){
        try{
           int number = Integer.parseInt(songNum);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        
        Song familyTies = new Song("Family Ties", "Baby Keem", 1000000);
        

        Song issues = new Song("issues", "Baby Keem", 50000);

        Song duragActivity = new Song("durag activity", new String[] {"Baby Keem", "Travis Scott"}, 100);

        SpotifyList melodicBlue = new CreatorList("The Melodic Blue", new Song[] {familyTies, issues, duragActivity} , "Baby Keem");


        melodicBlue.getInfo();


        SpotifyList dawnFM = new CreatorList("Dawn FM", "The Weeknd");

        dawnFM.addSong(new Song("song", "The Weeknd", 100));

        dawnFM.getInfo();

        SpotifyList myPlayList1 = new UserList("my playlist", "p", new Song[] {issues, familyTies}, "June 20, 2021");


        myPlayList1.getInfo();


        SpotifyList myPlayList = new UserList("my playlist", "user1", "June 20, 2021");

        myPlayList.addSong(duragActivity);
        myPlayList.addSong(1, issues);

        myPlayList.getInfo();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        ArrayList<Song> songlist = new ArrayList<>();

        System.out.println("Input (CMD) for the list of commands.");

        while(!input.toUpperCase().equals("END")) {

            System.out.print("> ");
            input = br.readLine().toUpperCase(); 
            
            if(input.equals("CMD")) { 
                System.out.println("\033[H\033[2J"); 

                System.out.println("CMD --> Print all Command Codes");
                System.out.println("NEWSONG --> Make new Song");
                System.out.println("PRINTSONGS --> Print all existing songs");
                System.out.println("NCREATORLIST --> Print Balance (end of day)");
                System.out.println("NUSERLIST --> Add Inventory");
                System.out.println("EDITLIST --> Edit List");
                System.out.println("VIEWLIST --> View Playlist/Album");
                System.out.println("END --> End Program");
                
            } 
            
            else if(input.equals("NEWSONG")) { 
                System.out.println("\033[H\033[2J");    
                
                System.out.print("Song Name: ");
                String songName = br.readLine();
                
                System.out.println("");

                System.out.print("No. of Artists: ");


                
                int numArtists = 0;
                String stringNumArtists = br.readLine();

                while(!isNum(stringNumArtists)) {
                    stringNumArtists = br.readLine();
                }

                numArtists = Integer.parseInt(stringNumArtists);
                
                
                

                System.out.println("");

                if(numArtists > 1) {
                    ArrayList<String> artists = new ArrayList<>();
                    for(int i = 0; i < numArtists; i++) {
                        System.out.print("Artist " + (i + 1) + ": ");
                        artists.add(br.readLine());
                        System.out.println("");
                    }

                    String[] artistArray = new String[artists.size()];
                    artistArray = artists.toArray(artistArray);

                    System.out.print("Plays: ");
                    String stringPlays = "";
                    int plays = 0;

                    while(!isNum(stringPlays)) {
                        stringPlays = br.readLine();
                    }
                    
                    plays = Integer.parseInt(stringPlays);

                    songlist.add(new Song(songName, artistArray, plays));
                    
                } else {
                    System.out.print("Artist: ");
                    String artist = br.readLine();
                    
                    System.out.print("Plays: ");
                    int plays = Integer.parseInt(br.readLine());

                    songlist.add(new Song(songName, artist, plays));
                    
                }

                
                
            }  

            else if(input.equals("PRINTSONGS")) {
                System.out.println("\033[H\033[2J");
                for(Song song : songlist) {
                    System.out.println(song);
                }
 
            }
            
            else if(input.equals("NCREATORLIST")) { 
                System.out.println("\033[H\033[2J");
                
                System.out.print("List Name: ");
                
                String listName = br.readLine();

                System.out.println("");

                System.out.print("List Creator: ");

                String listCreator = br.readLine();

                System.out.println("");

                System.out.print("# of songs to add: ");

                String stringSongs = "";
                int numSongs = 0;

                while(!isNum(stringSongs)) {
                    stringSongs = br.readLine();
                }

                numSongs = Integer.parseInt(stringSongs);

                Song[] trackList = new Song[numSongs];

                for (int i = 0; i < numSongs; i++) {
                    System.out.print("Song " + (numSongs + 1) + ":");

                    boolean switcher = true;
                    ArrayList<Song> songList = new ArrayList<>();

                    Song addSong = new Song(".", ".", 1);
                    while (switcher) {
                        String findSong = br.readLine();

                        for(Song song : songlist) {
                            if (findSong.equals(song.songName())) {
                                songList.add(song);
                                switcher = false;
                            }
                            break; 
                        }
                    }




                    

                }

                String[] songArray = new String[artists.size()];
                songArray = songList.toArray(songArray);
            
                
            } 
            
            else if(input.equals("NUSERLIST")) {
                System.out.println("\033[H\033[2J"); 
                
                     
            } 
            
            
            else if(input.equals("EDITLIST")) { 
                System.out.println("\033[H\033[2J");

            }  

            else if(input.equals("VIEWLIST")) {
                System.out.println("\033[H\033[2J");
            }
            
            
           

        }

        
  

    }
}
