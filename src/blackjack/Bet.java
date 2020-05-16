package blackjack;

public class Bet {
	private static int chips = 2000; //Player's initial amount.
	private static int bet;
	
	public Bet(){
		int chips = getChips();
		System.out.println("Chips: " + chips);
	}
	public Bet(int b, String gameW) {
		bet = b;
		String gameWon = gameW;
		int chips = getChips();
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
	
	public static int getChips() { return chips; }
}
