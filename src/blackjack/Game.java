package blackjack;
/**
 *
 * @author Maria Ramlochan & Nirdesh Shrestha
 */
import java.util.Arrays;
import java.util.Scanner;

public class Game {
	
    public static String[] dealerHand = new String[2];
    public static String[] playerHand = new String[2];
	public static boolean gameWon;
	
    public static void cards(){
        
        //Initializing the deck class.
        Deck deck1 = new Deck();
        Deck.shuffledDeck();
        
        int r;
        
        // To calculate the number of cards in the players and dealers have 
        int dealerCards = 0, playerCards = 0;
        int playerValue = 0, dealerValue = 0;
        System.out.println(Arrays.toString(Deck.deck));
        for(int initialCards = 0; initialCards < 4; initialCards++) {
            
            r = initialCards % 2;
            if(r==0) {
            	 //Placing the 1st and 3rd card in the players hands.
            	System.out.print("Draw " + (playerCards + 1) + ":\nPlayer draws: " + Deck.deck[initialCards]);
            	
            	playerHand[playerCards] = Deck.deck[initialCards]; 
            	
            	String card = playerHand[playerCards];
                
                playerValue += Values.values(card);
                //System.out.println("Player has: " + playerValue);
                playerCards++;
            } else {
            	//Placing the 2nd and 4th card in the dealer's hand.
            	System.out.println("\t| Dealer draws: " + Deck.deck[initialCards]+ "\n");
                dealerHand[dealerCards] = Deck.deck[initialCards];
                
                String card = dealerHand[dealerCards];
                
                dealerValue += Values.values(card);
                System.out.println("Dealer has: " + dealerValue + " points");
                dealerCards++;
            }  
        }
        System.out.println("Player's Points: " + playerValue);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Hit or Stand?\nType 'hit' to Hit and 'stand' to Stand");
        String nextMove = sc.nextLine();
        int nextCard = 4; //the location of the next card in the deck
        String[] playerHand2 = Arrays.copyOf(playerHand, playerHand.length + 1);
        if(nextMove.equalsIgnoreCase("hit")) {
	        do{ 
	        	if(playerValue == 21) {
	        		System.out.println("You Won");
	        		gameWon = true;
	        	}
	        	if (nextMove.equalsIgnoreCase("hit") && playerValue < 21){
		        	String card = Deck.deck[nextCard];
		        	
		            //Increasing the length in which the player hand can hold the next card.        
		        	playerHand2[playerCards] = card;
		        	
		        	System.out.println("You draw: " + card);
		        	
		        	//Coping and increasing one space in players hand
		        	playerHand = Arrays.copyOf(playerHand2, playerHand2.length);
		        	playerHand2 = Arrays.copyOf(playerHand, playerHand.length+1);
		        	playerValue += Values.values(card);
		        	System.out.println("Player's Points: " + playerValue);
		        	playerCards++;
		        	System.out.println("Your hand: " + Arrays.toString(playerHand));
		        	
		        	nextCard++; //incrementing the nextCard
		        	nextMove = sc.nextLine();
		        	
		        	//System.out.println(nextCard);testing if nextCard works	
		        } 
	        } while(!nextMove.equalsIgnoreCase("stand") && playerCards <= 5 && playerValue < 21);   
        }
        if (nextMove.equalsIgnoreCase("stand") && playerValue <= 21) {
        	System.out.println("you selected to stand");
        	String[] dealerHand2 = Arrays.copyOf(dealerHand, dealerHand.length + 1);
        	while(dealerValue < playerValue && dealerValue < 18){
        		String card = Deck.deck[nextCard];
        		dealerHand2[dealerCards] = card;
        		
       			System.out.println("Dealer Draws: " + card);
        			
       			dealerHand = Arrays.copyOf(dealerHand2, dealerHand2.length);
   	        	dealerHand2 = Arrays.copyOf(dealerHand, dealerHand.length+1);
            	
   	        	dealerValue += Values.values(card);
   	        	dealerCards++;
    	        nextCard++;
    	        
   	        	System.out.println("Dealer's Points: " + dealerValue);
	        	System.out.println("Your hand: " + Arrays.toString(playerHand));
	        	System.out.println("Dealer's hand: " + Arrays.toString(dealerHand));
        	} 
        	if(dealerValue > 21) {
        		System.out.println("You Win");
        		gameWon = true;
        	}else if(dealerValue > playerValue){
        		System.out.println("Dealer Wins");
        		gameWon = false;
        	}else {
        		System.out.println("Draw");
        	}
        } else if(playerValue == 21) {
        	System.out.println("You Won");
        	gameWon = true;
        } else {
        	System.out.println("You are busted");
        	System.out.println(Players.getName());;
        	gameWon = false;
        }

        //Players player = new Players();
    } 
    public void setGameWon(boolean gameWon) {
		Game.gameWon = gameWon;
	}
}

