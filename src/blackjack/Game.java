package blackjack;

public class Game {
	
	public static String[] dealerHand = new String[5];
	public static String[] playerHand = new String[5];
	
    public static void test(){
        // testing if the deck prints
        Deck deck1 = new Deck();
        deck1.shuffledDeck();
        int r;
        /* To calculate the number of cards in 
         * players and dealers have 
        */
        int dealerCards = 0;
        int playerCards = 0;

        for(int initialCards = 0; initialCards < 4; initialCards++) {
            
			r = initialCards % 2;
            if(r == 1) {
                //dealerCards = deck.deck[initialCards];
                System.out.println("\ndealer's hand: " + deck1.deck[initialCards]);
                dealerHand[dealerCards] = deck1.deck[initialCards];
                dealerCards++;
                //System.out.println("Dealer's cards value: " + Deck.deck.values()[];
                /*
                //Checking is the dealer's hand is more than 21
                if (Deck.values() > 21) {
                    System.out.println("The dealer's busted");
                } else if (Deck.values() <= 21){
                    System.out.println("The dealer will hit");
                }
                */   
            } else {
                System.out.println("\nplayers's hand: " + deck1.deck[initialCards]);
                playerHand[playerCards] = deck1.deck[initialCards]; 
                playerCards++;
                //System.out.println("Player's cards value: " + Deck.values());
                //playerCards = initialCards;
                
                /*
                //Checking is the player's hand is more than 21
                if (Deck.values() > 21) {
                    System.out.println("You have busted");
                }
                */
             }  
		}
        System.out.println(playerHand);
        System.out.println(dealerHand);
        
    }
	
}
