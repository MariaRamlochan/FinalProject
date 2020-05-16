package blackjack;
/**
 * This class executes the win or loses from the values taken from the values class
 * and initialize the shuffling and dealing hands of the player and the dealer.
 * 
 * @author Maria Ramlochan & Nirdesh Shrestha
 */
import java.util.Arrays;
import java.util.Scanner;

public class Game {
	
    public static String[] dealerHand = new String[2];
    public static String[] playerHand = new String[2];
	public static String gameWon = "";
	/**
	 * This method draws the first 4 initial cards from the deck and
	 * up to 5 cards for the players if they type hit. If not 
	 * according to the conditions it takes the appropriate action
	 */
    public static void cards(){
        
        //Initializing the deck class.
        Deck deck1 = new Deck();
        Deck.shuffledDeck();
        
        int r; //Initialize the remainder
        
        // To calculate the number of cards in the players and dealers have 
        int dealerCards = 0, playerCards = 0;
        int playerValue = 0, dealerValue = 0;
        
        for(int initialCards = 0; initialCards < 4; initialCards++) {
            
            r = initialCards % 2; //Caculating the remainder of the initial card
            if(r==0) {
                //Placing the 1st and 3rd card in the players hands.
                System.out.print("Draw " + (playerCards + 1) + ":\nPlayer draws: " + Deck.deck[initialCards]);
                playerHand[playerCards] = Deck.deck[initialCards]; 
                String card = playerHand[playerCards];
                
                //Add the values in the player's hands
                playerValue += Values.value(card);
                //Increasing the player's cards
                playerCards++;
                
            } else {
            	//Placing the 2nd and 4th card in the dealer's hand.
            	System.out.println("\t| Dealer draws: " + Deck.deck[initialCards]+ "\n");
                dealerHand[dealerCards] = Deck.deck[initialCards];
                String card = dealerHand[dealerCards];
                
                //Add the values in the dealer's hands
                dealerValue += Values.value(card);
                //Increasing the dealer's cards
                dealerCards++;
            }  
        }
        //Printing the total values added together
        System.out.println("Player's Points: " + playerValue);
        System.out.println("Dealer's Points: " + dealerValue);
        
        //Asking the playing if they would like to hit or stand 
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to Hit or Stand?\nType 'hit' to Hit and 'stand' to Stand");
        String nextMove = sc.nextLine();
        //the location of the next card in the deck
        
        int nextCard = 4;
        //Making a copy of the current player's hand and adding one space for more cards
        String[] playerHand2 = Arrays.copyOf(playerHand, playerHand.length + 1);
        if(nextMove.equalsIgnoreCase("hit")) { //Ignore if it's upper or lower case
	        do{ 
                    if(playerValue == 21) { //Player automatically wins if value is 21
                        System.out.println("You Won");
                        gameWon = "true";
	        		
                     }
                    if (nextMove.equalsIgnoreCase("hit") && playerValue < 21){
                        String card = Deck.deck[nextCard];
		        	
                        //Increasing the length in which the player hand can hold the next card.        
                        playerHand2[playerCards] = card;
		        	
		        	System.out.println("You draw: " + card);
		        	
		        	//Coping and increasing one space in player's hand
		        	playerHand = Arrays.copyOf(playerHand2, playerHand2.length);
		        	playerHand2 = Arrays.copyOf(playerHand, playerHand.length+1);
		        	playerValue += Values.value(card);
		        	System.out.println("Player's Points: " + playerValue);
		        	playerCards++;
		        	System.out.println("Your hand: " + Arrays.toString(playerHand));
		        	
		        	nextCard++; //incrementing the nextCard
		        	nextMove = sc.nextLine();	
		    } 
	        } while(!nextMove.equalsIgnoreCase("stand") && playerCards <= 5 && playerValue < 21);   
        }
        if (nextMove.equalsIgnoreCase("stand") && playerValue <= 21) {
            System.out.println("you selected to stand");
            //Coping and increasing one space in dealer's hand   
            String[] dealerHand2 = Arrays.copyOf(dealerHand, dealerHand.length + 1);
            while(dealerValue < playerValue && dealerValue < 18){
                String card = Deck.deck[nextCard];
                dealerHand2[dealerCards] = card;
        		
                System.out.println("Dealer Draws: " + card);
        			
                dealerHand = Arrays.copyOf(dealerHand2, dealerHand2.length);
                dealerHand2 = Arrays.copyOf(dealerHand, dealerHand.length+1);
            	
   	        dealerValue += Values.value(card);
   	        dealerCards++;
    	        nextCard++;
    	        
                System.out.println("Dealer's Points: " + dealerValue);
                System.out.println("Player's Points: " + playerValue);
                System.out.println("\nYour hand: " + Arrays.toString(playerHand));
                System.out.println("Dealer's hand: " + Arrays.toString(dealerHand));
            } 
            //Checking if the game is won or lost from the player's and dealer's values
            if(dealerValue > 21) {//If dealer has more than 21 the player wins
        		System.out.println("You Win");
        		gameWon="true";
        		
            }else if(dealerValue > playerValue){
        		System.out.println("Dealer Wins");
        		gameWon="false";	
            }
            
        } else if(playerValue == 21) {
        	System.out.println("You Won");
        	gameWon= "true";
        	System.out.println(gameWon);
        } else {
        	System.out.println("You are busted");
        	gameWon= "false";
        }
    } 
    
    /**
     * @param gW
    * This method sets the GameWon and prints it out
    */
    public static void setGameWon(String gW) {
		gameWon = gW;
		System.out.println(gameWon);
	}
    /**
    * This method gets GameWon by returning the String that gameWon is equal to.
     * @return 
    */
    public static String getGameWon() {return gameWon;}
}

