/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.*;
/**
 * This program let's the user play a simplified version of a BlackJack game
 * against the computer(dealer).
 * 
 * @author Maria Ramlochan
 * @author Nirdesh Shrestha
 */
public class BlackJack {
	
    /**
     * This is the main method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	String name;
    	int cash = Bet.chips; //Player's initial amount.
    	
    	//Initialize the Players class
    	Players newPlayer = new Players();
        System.out.println(newPlayer);
        
        //Ask the player to enter the amount he/she wants to bet
    	System.out.println("\nEnter the amount you wish bet: ");
    	int bet = sc.nextInt(); 
        
    	//Start the Game
    	Game game = new Game();
        game.cards();
       	
        //Deducts or adds the amount of bet to the total amount of chips
        Bet betObject1 = new Bet(bet, Game.gameWon);

        //Final Output
        System.out.println(newPlayer);
    }
} //end class
