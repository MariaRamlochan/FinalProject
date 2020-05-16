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
	public static String name; //Player's name. 
        
    
    //empty constructor 
    public Players() {
    	System.out.println("******** WELCOME TO BLACKJACK *********");
    	enterName();
    }
    
    //This method is called in the main class to enter and store the name of the player
    private void enterName() {
    	Scanner input = new Scanner(System.in);
    	String name;
    	
    	System.out.println("Please enter you name to begin!");
		name = input.nextLine();
		setName(name);
		
	}
    /**
     * Setter to set the name
     * @param name
     */
    public void setName(String name) { this.name = name; }
    /**
     * Getter to get the name
     * @return
     */
    public static String getName() { return name; }
    
    
    @Override
    /**
     * Print the given test when ever the name is called
     */
    public String toString() {
        return  "\n**************************************" +
                "\n* Hello " + name + 
                "\n**************************************" +
                "\n* You have " + Bet.chips + " Chips left" +
                "\n**************************************\n";
    }
} //end class

