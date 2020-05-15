package blackjack;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
	
	public static String[] dealerHand = new String[2];
	public static String[] playerHand = new String[2];
	
    public static void initialCards(){
        // testing if the deck prints
        
    	Deck deck1 = new Deck();
        Deck.shuffledDeck();
    	
        int r;
        
        // To calculate the number of cards in the players and dealers have 
        int dealerCards = 0;
        int playerCards = 0;
        System.out.println(Arrays.toString(Deck.deck));
        for(int initialCards = 0; initialCards < 4; initialCards++) {
            
			r = initialCards % 2;
            if(r == 1) {
            	System.out.println("Dealer draws: " + Deck.deck[initialCards]);
                
                dealerHand[dealerCards] = Deck.deck[initialCards];
                //printing the first words of the card
                int index = dealerHand[dealerCards].indexOf(' ');
                String card = dealerHand[dealerCards].substring(0, index);
                
                //System.out.println(card);
                Values.values(card);
                
                dealerCards++;
            } else { 
            	System.out.println("Player draws: " + Deck.deck[initialCards]);
            	
            	playerHand[playerCards] = Deck.deck[initialCards]; 
            	
                //printing the first words of the card
                int index = playerHand[playerCards].indexOf(' ');
                String card = playerHand[playerCards].substring(0, index);
                
                //System.out.println(card);
                Values.values(card);
                
                playerCards++;
             	}   	
        	}
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Hit or Stand?\nType 'hit' to Hit and 'stand' to Stand");
        String nextMove = sc.nextLine();
        if (nextMove.equalsIgnoreCase("hit")) {
			//System.out.println("you get the next card");
        	String card = Deck.deck[4];
        	
        	int p = 2;
        	String[] playerHand2 = Arrays.copyOf(playerHand, playerHand.length+1);;	
        	playerHand2[2] = card;
        	System.out.println(card);
        	
        	System.out.println(Arrays.toString(playerHand2));
        	
		} else if (nextMove.equalsIgnoreCase("stand")) {
			//System.out.println("you selected to stand");
		}
        
        //Printout the Player's and Dealer's hand while showing the space available
//        System.out.println("****************************************************");
//        System.out.println("\nYour hand: " + Arrays.toString(playerHand));
//        System.out.println("Player's cards value: ");
//        System.out.println("****************************************************");
//        System.out.println("\nDealer's hand: " + Arrays.toString(dealerHand));
//        System.out.println("Dealer's cards value: ");
        
    }
    
    //This was the constructor for the next move
//    public static void nextMove(String nextMove) {
//		Deck.deck;
//    	if (nextMove.equalsIgnoreCase("hit")) {
//			//System.out.println("you get the next card");
//			playerHand = Deck.shuffledDeck();
//			System.out.println(playerHand);
//		} else if (nextMove.equalsIgnoreCase("stand")) {
//			//System.out.println("you selected to stand");
//		}
//
//	}
}
