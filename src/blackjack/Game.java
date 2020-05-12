package blackjack;

public class Game {
	
	// testing if the deck prints
	Deck deck = new Deck();
	deck.shuffledDeck();
	int r;
	for(int initialCards = 0; initialCards < 4; initialCards++) {
		r = initialCards % 2;
		if(r == 1) {
			System.out.println(initialCards + " is odd");
			System.out.println("dealer's hand: " + deck.deck[initialCards]);
		} else {
			System.out.println(initialCards + " is even");
			System.out.println("players's hand: " + deck.deck[initialCards]);
		}    		
	}

	
}
