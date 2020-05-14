/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 * Player and dealer hands in this class, as well as the amount of cash the
 * player gains and/or loses.
 * 
 * @author Maria Ramlochan
 */
public class Players {
    private String name; //Player's name. 
    private static int cash = 2000; //Player's initial amount.
    private static int bet;
    
    //empty constructor 
    public Players() {
    	enterName();
    }
    
    //Players constructor.
    public Players(String name) {
        this.name = name;
        //this.hands();
        System.out.println(this);
    }
    
    //This method is called in the main class to enter and store the name of the player
    private void enterName() {
    	Scanner input = new Scanner(System.in);
    	String name;
    	
    	System.out.println("Please enter you name to begin!");
		name = input.nextLine();
		setName(name);
		System.out.println(this);;
		
	}
    //Setting the player's name.
    public void setName(String name) { this.name = name; }
    //public static void setBet();
    
    //getting the player's name.
    public String getName() { return name; }
    public static int getCash() { return cash; }
    
    @Override
    public String toString() {
        return  "\n**************************************" +
                "\nWelcome " + name + 
                "\n**************************************" +
                "\nYou have an initial value of: " + cash + "$\n";
    }
} //end class

