package blackjack;
/**
 * This is the Deck for the Blackjack Game.
 * 
 * @author Nirdesh Shrestha
 */
public class Deck {
	
	private String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public String[] deck;
    
    static int totalCards;
    
    public Deck(){
        // initialize deck
        // total number of cards
        totalCards = Suits.length * Ranks.length;
        
        // creating the deck
        deck = new String[totalCards];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
            }
        }
        
        for (int i = 0; i < totalCards; i++) {
            String temp = deck[i];
            deck[i] = temp;
        }

        /*
         * // print initial deck
         * for (int i = 0; i < totalCards; i++) {
            System.out.println(deck[i]);
        	}       
         * 
         */
        
        // shuffle
        

        // print shuffled deck
        //for (int i = 0; i < totalCards; i++) {
        //System.out.println(deck[i]);
        //}  
    }
    
    //constructor to shuffle the Deck (note: not gonna print in real game!)
    public void shuffledDeck() {
    	for (int i = 0; i < totalCards; i++) {
            int r = i + (int) (Math.random() * (totalCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
            //testing if it prints
            System.out.println("card no " + (i+1) + " is " + deck[i]);
        }
    }
    
    /*
    //pull two cards for the dealer and the player 
    public void hands() {
    	//initial cards = 4
    	int initialCards = 4;
    	int r = initialCards % 1;	
    }
    */
}
