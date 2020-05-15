/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.*;
/**
 *
 * @author Maria Ramlochan & Nirdesh Shrestha
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	String name;
    	Chips chipsObject = new Chips();
        int cash = Chips.getCash(); //Player's initial amount.
        int bet; //Amount the player will bet.

        Players test = new Players();
        chipsObject.printChips();
        //Game.initialCards();
        

        System.out.println("\nEnter the amount you wish bet: ");
        //bet = input.nextInt();  
        System.out.println(test);

        
    }
       
} //end class
