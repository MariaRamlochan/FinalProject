/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.*;
/**
 *
 * @author Maria Ramlochan & Nirdesh Shrestha
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String name;
//        int cash = Players.getCash(); //Player's initial amount.
//        int bet; //Amount the player will bet.
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("******** WELCOME TO BLACKJACK *********");
//        
//        System.out.println("Please enter a Username: ");
//        name = input.nextLine();
//        Players player = new Players(name);
//        player.setName(name);
//        player.toString();
//        
//        
//        System.out.println("\nEnter the amount you wish bet: ");
//        bet = input.nextInt();
    	
    	// testing if the deck prints
    	Deck game = new Deck();
    	game.shuffledDeck();
    	int r;
    	for(int initialCards = 0; initialCards < 4; initialCards++) {
    		r = initialCards % 2;
    		if(r == 1) {
    			System.out.println(initialCards + " is odd");
    			System.out.println("dealer's hand: " + game.deck[initialCards]);
    		} else {
    			System.out.println(initialCards + " is even");
    			System.out.println("players's hand: " + game.deck[initialCards]);
    		}    		
    	}
    }
    
    
} //end class
