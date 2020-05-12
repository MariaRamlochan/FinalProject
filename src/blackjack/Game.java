package blackjack;

public class Game {
	
    public static int test(){
        // testing if the deck prints
        Deck deck = new Deck();
        deck.shuffledDeck();
        int r;
        int dealerCards = 0;
        int playerCards = 0;
        
	for(int initialCards = 0; initialCards < 4; initialCards++) {
            r = initialCards % 2;
                
            //System.out.printf("%d %d ", dealerCards, playerCards);
            if(r == 1) {
                //dealerCards = deck.deck[initialCards].;
                System.out.println("\ndealer's hand: " + Deck.deck[initialCards]);
                System.out.println("Dealer's cards value: " + Deck.values());
                
                //Checking is the dealer's hand is more than 21
                if (Deck.values() > 21) {
                    System.out.println("The dealer's busted");
                } else if (Deck.values() <= 21){
                    System.out.println("The dealer will hit");
                }
                    
                 
            } else {
                System.out.println("\nplayers's hand: " + Deck.deck[initialCards]);
                System.out.println("Player's cards value: " + Deck.values());
                //playerCards = initialCards;
                
                //Checking is the player's hand is more than 21
                if (Deck.values() > 21) {
                    System.out.println("You have busted");
                }
             } 
                
	}
        return dealerCards + playerCards;
    }
	
}
