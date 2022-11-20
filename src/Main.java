import java.io.*;
import java.lang.reflect.Array;
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

    private static void newUserList() throws IOException {
        System.out.println("\033[H\033[2J");
                
        System.out.print("List Name: ");
        
        String listName = br.readLine();

        System.out.println("");

        System.out.print("User: ");

        String user = br.readLine();

        System.out.println("");

        System.out.print("# of songs to add: ");

        String stringSongs = "";
        int numSongs = 0;

        while(!isNum(stringSongs)) {
            stringSongs = br.readLine();
        }

        numSongs = Integer.parseInt(stringSongs);

        

        ArrayList<Song> songList = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            System.out.print("Song " + (i + 1) + ": ");

            boolean switcher = true;
            

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

        Song[] songArray = new Song[songList.size()];
        songArray = songList.toArray(songArray);

        System.out.print("Creation Date: ");

        String creationDate = br.readLine();
        
        if(numSongs > 0) {
            userListList.add(new UserList(listName, user, songArray, creationDate));
        } else {
            userListList.add(new UserList(listName, user, creationDate));
        }
    }

    private static void newSong() throws IOException{
        System.out.println("\033[H\033[2J");    
                
        System.out.print("Song Name: ");
        String songName = br.readLine();
                
        System.out.print("No. of Artists: ");
   
        int numArtists = 0;
        String stringNumArtists = br.readLine();

        while(!isNum(stringNumArtists)) {
            stringNumArtists = br.readLine();
        }

        numArtists = Integer.parseInt(stringNumArtists);  
                
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

            String stringPlays = "";

            while(!isNum(stringPlays)) {
                stringPlays = br.readLine();
            }


            int plays = Integer.parseInt((stringPlays));

            songlist.add(new Song(songName, artist, plays));
                    
        }      
                
    }  



    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String input = "";
    static ArrayList<Song> songlist = new ArrayList<>();
    static ArrayList<SpotifyList> creatorListList = new ArrayList<>();
    static ArrayList<SpotifyList> userListList = new ArrayList<>();

    public static void main(String[] args) throws IOException {        

        System.out.println("Input (CMD) for the list of commands.");

        while(!input.toUpperCase().equals("END")) {

            System.out.print("> ");
            input = br.readLine().toUpperCase(); 
            
            if(input.equals("CMD")) { 
                System.out.println("\033[H\033[2J"); 

                System.out.println("CMD --> Print all Command Codes");
                System.out.println("NEWSONG --> Make new Song");
                System.out.println("PRINTSONGS --> Print all existing songs");
                System.out.println("PRINTLISTS --> Print all lists");
                System.out.println("NCREATORLIST --> New Creator List");
                System.out.println("ADDSONG --> Add Song to List");
                System.out.println("NUSERLIST --> New User List");
                System.out.println("LISTINFO --> View List Info");
                System.out.println("END --> End Program");
                
            } 
            
            else if(input.equals("NEWSONG")) { 
                newSong();
                
            } 
       
      
            
            else if(input.equals("NUSERLIST")) { 
              newUserList();
            } 

            else if(input.equals("ADDSONG")) {
               addSong();
                
            }



            
            
 

            else if(input.equals("LISTINFO")) {
                System.out.println("\033[H\033[2J");
            


                System.out.print("Find List: ");

                    boolean switcher = true;
                    

                    while (switcher) {
                        String findList = br.readLine();

                        for(SpotifyList CreatorList : creatorListList) {
                            if (findList.equals(CreatorList.getListName())) {
                                CreatorList.getInfo();
                                switcher = false;
                            }
                            break; 
                        }

                        for(SpotifyList userList : userListList) {
                            if (findList.equals(userList.getListName())) {
                                userList.getInfo();
                                switcher = false;
                            }
                            break; 
                        }
                    }
            
                }

            
           

        }

        
  

    }
}
