/** Program: Display Player Program
 * File: DisplayPlayer.java
 * Summary: Displays two players name, position, ATT Stats,
 * YDS Stats, and TD Stats
 * Author: Tim James
 * Date: November 5, 2017
 */

public class DisplayPlayer {
    public static void main(String[] args) { 
        Player player = new Player("Kapri Bibbs", "RB", "Broncos", 29, 129, 0, 203, "5\' 11\"", 24, 35); /**
         * instantiate person object, initializes the Person class variables */
        player.displayPlayerInfo(); // display the player information
        
        System.out.println(); // blank line
        
        player = new Player("Trevor Siemian", "QB", "Broncos", 86, 629, 7, 220, "6\' 3\"", 25, 13);
        player.displayPlayerInfo(); // display the player information
    }
    
}
