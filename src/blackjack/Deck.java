package blackjack;

/**
 * This is the Deck for the Blackjack Game.
 * 
 * @author Nirdesh Shrestha
 */
public class Deck {
	//Array to store four suits of the Deck
    private String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    //Array to store 13 ranks of the deck
    private String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    //Array to store the shuffled deck
    public static String[] deck;
    
    static int totalCards;
    
    /**
     * Constructor to Create and Shuffle the deck
     */
    public Deck(){
        // total number of cards
        totalCards = Suits.length * Ranks.length;
        
        // creating the deck
        deck = new String[totalCards];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
            	deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];           	
            }
        }
    }
    
    //constructor to shuffle the Deck (note: not going to print in the real game!)
    public static String[] shuffledDeck() {
    	for (int i = 0; i < totalCards; i++) {
            int r = i + (int) (Math.random() * (totalCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        } return deck;
    }  
}
