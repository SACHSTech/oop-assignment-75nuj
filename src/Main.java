import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
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

        System.out.println("Input (CMD) for the list of commands.");

        while(!input.toUpperCase().equals("END")) {

            System.out.print("> ");
            input = br.readLine().toUpperCase(); 


            
            if(input.equals("CMD")) { //if user's input is CMD (show all function keywords)
                System.out.println("\033[H\033[2J"); 

                System.out.println("CMD --> Print all Command Codes");
                System.out.println("NEWSONG --> ");
                System.out.println("NCREATORLIST --> Print Balance (end of day)");
                System.out.println("NUSERLIST --> Add Inventory");
                System.out.println(" --> Add Expenses");
                System.out.println("CASH --> CASHIER");
                System.out.println("END --> End program.");
                System.out.println("(CASHIER COMMANDS) \n-- SHOW INV (show inventory) \n--> DONE (finish session)" 
                                        + "\n--> PRODUCT KEYWORD then NUMBER/WEIGHT (inputing new item to cash)");
                
            } 
            
            
            else if(input.equals("DAY")) { 
               
                
            } 
            
            
            else if(input.equals("A INV")) { 
                System.out.println("\033[H\033[2J"); 

                
            } 
            
            
            else if(input.equals("A EXP")) {
                System.out.println("\033[H\033[2J"); 
                
                //Input - User inputs how many times they want to add expenses
                System.out.print("# of expenses: ");
                int times = (int) get_num();

                for(int i = 0; i < times; i++) {
                    
                    //Input - User inputs the expense name, expense length, and cost of expense, which is stored in an object
                    System.out.print("Expense Name: ");
                    String expenseN = sc.nextLine();
                    System.out.print("Expense Length (in days): ");
                    int expenseL = (int) get_num(); //execute get_num function (function that loops until valid input is given)
                    System.out.print("Expense (in dollars): ");
                    double expen = get_num()/expenseL; //daily expense is total expense divided by expense length 

                    System.out.println();


                    expenses.add(new Main(expenseN, expenseL, expen)); // create new object and store in expenses ArrayList
      
                }
                
            } 
            
            
            else if(input.equals("CASH")) { // if user's input is CASH (cashier functionality)
                System.out.println("\033[H\033[2J"); // clear screen

                //Process - return value from cashier function is added to gains from day
                gain += cashier(inventory); //execute cashier function (with inventory ArrayList as parameter), add return to what gain already has
                
            }  
            
            
            else if (input.equals("P INV")) {
                //Output - Print out existing inventory
                print_inventory(inventory);
            }



        
  

    }
}
