package blackjack;

public class Game {
	
    public static void test(){
        // testing if the deck prints
        Deck deck = new Deck();
        deck.shuffledDeck();
        int r;
        
	for(int initialCards = 0; initialCards < 4; initialCards++) {
		r = initialCards % 2;
		if(r == 1) {
                    
                    System.out.println("dealer's hand: " + deck.deck[initialCards]);
		} else {
                    System.out.println("players's hand: " + deck.deck[initialCards]);
		} 
             
             
                
	}
    }
	
}
