package blackjack;
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
    
    //constructor to shuffle the Deck (note: not going to print in the real game!)
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
    
    public static int values() {
        int value = 0;
        switch(deck[0]) {
            case "Ace": 
            	value = 1;
                //System.out.println(value);
            	break;
            case "2": 
            	value = 2;
                //System.out.println(value);
            	break;
            case "3": 
            	value = 3;
                //System.out.println(value);
            	break;
            case "4": 
            	value = 4;
                //System.out.println(value);
            	break;
            case "5": 
            	value = 5;
                //System.out.println(value);
            	break;
            case "6": 
            	value = 6;
                //System.out.println(value);
            	break;
            case "7": 
            	value = 7;
                //System.out.println(value);
            	break;
            case "8": 
            	value = 8;
                //System.out.println(value);
            	break;
            case "9": 
            	value = 9;
                //System.out.println(value);
            	break;
            case "10": 
            	value = 10;
                //System.out.println(value);
            	break;
            case "Jack":
            	value = 10;
                //System.out.println(value);
            	break;
            case "Queen": 
            	value = 10;
                //System.out.println(value);
                break;
            case "King": 
            	value = 10;
                //System.out.println(value);
                break; 
                
        }
        return value;
        
    }
    
}
