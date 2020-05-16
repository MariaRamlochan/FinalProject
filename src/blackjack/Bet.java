package blackjack;

public class Bet {
	private static int chips = 2000; //Player's initial amount.
	private static int bet;
	
	public Bet(){
		int chips = getChips();
		System.out.println("Chips: " + chips);
	}
	public Bet(int b) {
		bet = b;
		int chips = getChips();
		if(Game.gameWon) {
			chips += bet;	
			setChips(chips);
		} else {
			chips -= bet;
			setChips(chips);
		}
	} 
	public void setChips(int chips) { this.chips = chips; }
	
	public static int getChips() { return chips; }
}
