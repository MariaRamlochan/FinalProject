/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Maria Ramlochan
 */
public class Players {
    private String name;
    private static int cash = 2000; //Player's initial amount.
    
    public Players(String name) {
        this.name = name;
        System.out.println(this);
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    
    //getters
    public String getName() { return name; }
    public static int getCash() { return cash; } 
    
    
    	@Override
    public String toString() {
        return  "\n**************************************" +
                "\nWelcome " + name + 
                "\n**************************************" +
                "\nYou have an initial value of: " + cash + "$";
    }
} //end class

