package blackjack;

import java.util.Arrays;

public class Game {
	
	public static String[] dealerHand = new String[2];
	public static String[] playerHand = new String[2];
	
    public static void test(){
        // testing if the deck prints
        Deck deck1 = new Deck();
        deck1.shuffledDeck();
        int r;
        
        // To calculate the number of cards in the players and dealers have 
        int dealerCards = 0;
        int playerCards = 0;

        for(int initialCards = 0; initialCards < 4; initialCards++) {
            
			r = initialCards % 2;
            if(r == 1) {
                
                System.out.println("Dealer draws: " + deck1.deck[initialCards]);
                dealerHand[dealerCards] = deck1.deck[initialCards];
                
                //printing the first words of the card
                int index = dealerHand[dealerCards].indexOf(' ');
                String card = dealerHand[dealerCards].substring(0, index);
                System.out.println(card);
                
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
                System.out.println("Player draws: " + deck1.deck[initialCards]);
                playerHand[playerCards] = deck1.deck[initialCards]; 
                
                //printing the first words of the card
                int index = playerHand[playerCards].indexOf(' ');
                String card = playerHand[playerCards].substring(0, index);
                System.out.println(card);
                
                playerCards++;
                
                /*
                //Checking is the player's hand is more than 21
                if (Deck.values() > 21) {
                    System.out.println("You have busted");
                }
                */
             }  
	}
        //Printout the Player's and Dealer's hand while showing the space available
//        System.out.println("****************************************************");
//        System.out.println("\nYour hand: " + Arrays.toString(playerHand));
//        System.out.println("Player's cards value: ");
//        System.out.println("****************************************************");
//        System.out.println("\nDealer's hand: " + Arrays.toString(dealerHand));
//        System.out.println("Dealer's cards value: ");
        
    }
	
}
