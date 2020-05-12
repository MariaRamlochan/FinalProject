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
            //System.out.println("card no " + (i+1) + " is " + deck[i]);
        }
    }
    
    public static value() {
        switch() {
            case "Ace": 
            v = 1;
            break;
            case 2: 
            v = 2;
            break;
            case 3: 
            v = 3;
            break;
            case 4: 
            v = 4;
            break;
            case 5: 
            v = 5;
            break;
            case 6: 
            v = 6;
            break;
            case 7: 
            v = 7;
            break;
            case 8: 
            v = 8;
            break;
            case 9: 
            v = 9;
            break;
            case 10: 
            v = 10;
            break;
            case "Jack": 
            v = 10;
            break;
            case "Queen": 
            v = 10;
            break;
            case "King": 
            v = 10;
            break;
            
        }
    }
    
}
