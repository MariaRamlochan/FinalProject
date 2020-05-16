package blackjack;
/**
 * This class increase or decrease the amount the player bets and removes it 
 * from the initial total.
 * 
 * @author Nirdesh Shrestha
 */

public class Bet {
	public static int chips = 2000; //Player's initial amount.
	public static int bet;
	/**
	 * Bet Constructor
	 * @param b 		Amount of bet
	 * @param gameW		Game Won/Lost/Draw
	 */
	public Bet(int b, String gameW) {
		bet = b; 
		String gameWon = gameW;
		this.chips = chips;
		
		if(gameWon.equalsIgnoreCase("true")) {
			Bet.chips += bet;	
			setChips(chips);
		} else if (gameWon.equalsIgnoreCase("false")) {
			Bet.chips -= bet;
			setChips(chips);
		} else {
			setChips(chips);
		}
	} 
	/**
	 * Setter to set value of chips
	 * @param chips
	 */
	public void setChips(int chips) { this.chips = chips; }
}
