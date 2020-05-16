package blackjack;

public class Bet {
	public static int chips = 2000; //Player's initial amount.
	public static int bet;
	
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
	public void setChips(int chips) { this.chips = chips; }
}
