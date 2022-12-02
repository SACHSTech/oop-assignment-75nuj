package Spotify;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    /**
     * Checks whether input is a number
     * @param songNum
     * @return boolean of whether it is a number or not
     */
    private static boolean isNum(String songNum){
        try{
           int number = Integer.parseInt(songNum);
           if(number > 0) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;

        
        
    }

    public static void main(String[] args) throws IOException {   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<Song> songlist = new ArrayList<>();
        ArrayList<SpotifyList> creatorListList = new ArrayList<>();
        ArrayList<SpotifyList> userListList = new ArrayList<>();

        //preset songs
        songlist.add(new Song("Blinding Lights", "The Weeknd", 250000000));
        songlist.add(new Song("Anti-Hero", "Taylor Swifts", 250000000));
        songlist.add(new Song("Bad Blood", "Taylor Swift", 250000000));
        songlist.add(new Song("Rich Flex", new String[]{"Drake", "21 Savage"}, 250000000));
        songlist.add(new Song("Hit 'Em Up", "Tupac Shakur", 250000000));
     

        System.out.println("Input (CMD) for the list of commands.");

        //loop console until user inputs end
        while(!input.toUpperCase().equals("END")) {

            System.out.print("> ");
            input = br.readLine().toUpperCase(); 
            
            //print commands
            if(input.equals("CMD")) { 
                System.out.println("\033[H\033[2J"); 

                System.out.println("CMD --> Print all Command Codes");
                System.out.println("NEWSONG --> Make new Song");
                System.out.println("PRINTSONGS --> Print all existing songs");
                System.out.println("PRINTLISTS --> Print all lists");
                System.out.println("NCREATORLIST --> New Creator List");
                System.out.println("NUSERLIST --> New User List");
                System.out.println("ADDSONG --> Add Song to List");
                System.out.println("LISTINFO --> View List Info");
                System.out.println("END --> End Program");
                
            } 


            //make a new song
            else if(input.equals("NEWSONG")) { 
                System.out.println("\033[H\033[2J");    
                
                //Ask for song name, artists on song and plays
                System.out.print("Song Name: ");
                String songName = br.readLine();
                        
                System.out.print("No. of Artists: ");
        
                int numArtists = 0;
                String stringNumArtists = br.readLine();

                while(!isNum(stringNumArtists)) {
                    stringNumArtists = br.readLine();
                }

                numArtists = Integer.parseInt(stringNumArtists);  
                    
                //constructor varies
                if(numArtists > 1) {
                    ArrayList<String> artists = new ArrayList<>();
                    for(int i = 0; i < numArtists; i++) {
                        System.out.print("Artist " + (i + 1) + ": ");
                        artists.add(br.readLine());
                    }

                    String[] artistArray = new String[artists.size()];
                    artistArray = artists.toArray(artistArray);

                    System.out.print("Plays: ");
                    String stringPlays = "";
                    int plays = 0;
                    
                    //ensures error doesn't occur doesn't occur if user types in something not a number
                    while(!isNum(stringPlays)) {
                        stringPlays = br.readLine();
                    }
                            

                    //makes song object and puts it into an object which is put into the overall song list
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


            //make a new creator list
            else if(input.equals("NCREATORLIST")) { 
                System.out.println("\033[H\033[2J");
                
                //get list name, creator, number of songs and songs in the playlist
                System.out.print("List Name: ");
                
                String listName = br.readLine();


                System.out.print("List Creator: ");

                String listCreator = br.readLine();


                System.out.print("# of songs to add: ");

                String stringSongs = "";
                int numSongs = 0;

                //checks whether input is a number
                while(!isNum(stringSongs)) {
                    stringSongs = br.readLine();
                }

                numSongs = Integer.parseInt(stringSongs);


                ArrayList<Song> songList = new ArrayList<>();
                
                //adds number of songs that the user wants
                for (int i = 0; i < numSongs; i++) {
                    System.out.print("Song " + (i + 1) + ": ");

                    boolean switcher = true;

                    //loops until input matches a song in the song list
                    while (switcher) {
                        String findSong = br.readLine();

                        for(Song song : songlist) {
                            if (findSong.equals(song.getSongName())) {
                                songList.add(song);
                                switcher = false;
                            }
                        }
                    }

                }
                
                //make song array using inputted songs
                Song[] songArray = new Song[songList.size()];
                songArray = songList.toArray(songArray);
                
                //add creator list to creator list array list while making a new object
                creatorListList.add(new CreatorList(listName, songArray, listCreator));

            } 


       
            //creates a new user list
            else if(input.equals("NUSERLIST")) { 
                System.out.println("\033[H\033[2J");

                //get info for user list object: list name, user making list, and songs which are going to be placed in the list, creation               
                System.out.print("List Name: ");
                
                String listName = br.readLine();

                System.out.println("");

                System.out.print("User: ");

                String user = br.readLine();

                System.out.println("");

                System.out.print("# of songs to add: ");

                String stringSongs = "";
                int numSongs = 0;

                //checks input is a number
                while(!isNum(stringSongs)) {
                    stringSongs = br.readLine();
                }

                numSongs = Integer.parseInt(stringSongs);

                ArrayList<Song> songList = new ArrayList<>();

                
                for (int i = 0; i < numSongs; i++) {
                    System.out.print("Song " + (i + 1) + ": ");

                    boolean switcher = true;
                    
                    //loops until input matches a song name
                    while (switcher) {
                        String findSong = br.readLine();

                        for(Song song : songlist) {
                            if (findSong.equals(song.getSongName())) {
                                songList.add(song);
                                switcher = false;
                            }
                        }
                    }                 

                }
                //makes array from inputted songs
                Song[] songArray = new Song[songList.size()];
                songArray = songList.toArray(songArray);

                System.out.print("Creation Date: ");

                String creationDate = br.readLine();

                //constructor depends on whether songs were placed into it or not                
                if(numSongs > 0) {
                    userListList.add(new UserList(listName, user, songArray, creationDate));
                } else {
                    userListList.add(new UserList(listName, user, creationDate));
                }
            } 




            //adds a new song to a spotify list in a specific position
            else if(input.equals("ADDSONG")) {
                System.out.println("\033[H\033[2J"); 
                
                boolean switcher = true;

                //gets position that user wants to put into playlist
                System.out.print("Add Song to Position: ");

                String orderNum = br.readLine();
                
                //checks input is a number
                while(!isNum(orderNum)) {
                    orderNum = br.readLine();
                }

                int order = Integer.parseInt(orderNum);
                

                while (switcher) {
                    //finds a list, checks through list of creatorlists and userlists to find if input matches the name of the list
                    System.out.print("Find List: ");
                    String findList = br.readLine();

                    for(SpotifyList CreatorList : creatorListList) {
                        if (findList.equals(CreatorList.getListName())) {
                            System.out.print("Add Song: ");
                            while (switcher) {
                                String findSong = br.readLine();
                                
                                //if list is found, then find a song in the program's song list, and adds this song to the list in the position asked for
                                for(Song song : songlist) {
                                    if (findSong.equals(song.getSongName())) {
                                        CreatorList.addSong(order, song);
                                        switcher = false;
                                    }
                                 
                                }
                            }
                            switcher = false;
                        }
                        break; 
                    }

                    for(SpotifyList userList : userListList) {
                        if (findList.equals(userList.getListName())) {
                            System.out.print("Add Song: ");
                            while (switcher) {
                                String findSong = br.readLine();
                                
                                //if list is found, then find a song in the program's song list, and adds this song to the list in the position asked for
                                for(Song song : songlist) {
                                    if (findSong.equals(song.getSongName())) {
                                        userList.addSong(order, song);
                                        switcher = false;
                                    }
                                    
                                }
                            }
                            switcher = false;
                        }
                        
                    }
                }
            }



            //prints the information about a specific user/creator list
            else if(input.equals("LISTINFO")) {
                System.out.println("\033[H\033[2J");

                System.out.print("Find List: ");

                boolean switcher = true;
                    
                //loops until input matches the name of a user or creator list
                //uses .getInfo() method to output information about this list
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

            //prints the songs in the program's songlist
            else if(input.equals("PRINTSONGS")) {
                System.out.println("\033[H\033[2J");
                for(Song song : songlist) {
                    System.out.println(song);
                }
 
            }


            //prints user lists and creator lists in the program's lists
            else if(input.equals("PRINTLISTS")) {
                System.out.println("\033[H\033[2J");

                for(SpotifyList creatorList: creatorListList) {
                    System.out.println(creatorList);
                }

                

                for(SpotifyList userList: userListList) {
                    System.out.println(userList);
                }

            }

    
        }
    
    }
}
