package blackjack;

import java.util.Arrays;

/**
 * This is the Deck for the Blackjack Game.
 * 
 * @author Nirdesh Shrestha
 */
public class Deck {
    private String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] deck;
    
    static int totalCards;
    
    public Deck(){
        // total number of cards
        totalCards = Suits.length * Ranks.length;
        
        // creating the deck
        deck = new String[totalCards];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
            	deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
            	System.out.println(deck[Suits.length*i + j]);
            }
        }
    }
    
    //constructor to shuffle the Deck (note: not going to print in the real game!)
    public void shuffledDeck() {
    	for (int i = 0; i < totalCards; i++) {
            int r = i + (int) (Math.random() * (totalCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }  
}
