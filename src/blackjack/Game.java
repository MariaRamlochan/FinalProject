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
                    
                 //return initialCards;
            } else {
                 System.out.println("\nplayers's hand: " + Deck.deck[initialCards]);
                 System.out.println("Player's cards value: " + Deck.values());
                 playerCards = initialCards;
                 //return initialCards;
             } 
                
	}
        return dealerCards + playerCards;
    }
	
}
