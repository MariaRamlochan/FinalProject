package blackjack;

public class Chips {
	private static int cash = 2000; //Player's initial amount.
	private static int bet;
	
	public Chips(){

	}
	
	public static int getCash() { return cash; }

	public void  printChips() {
		System.out.println("You have: " + getCash());
		System.out.println("Your name is: " + Players.getName());	
	}
}
