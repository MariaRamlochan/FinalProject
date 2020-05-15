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
        //Scanner sc = new Scanner(System.in);
    	String name;
        int cash = Players.getCash(); //Player's initial amount.
        int bet; //Amount the player will bet.
        
        Players test = new Players();
        
        Game.initialCards();
        
//        //This determines the next move of the player
//        System.out.println("Do you want to Hit or Stand?\nType 'hit' to Hit and 'stand' to Stand");
//        String nextMove = sc.nextLine();
//		Game.nextMove(nextMove);
        
        //System.out.println("\nEnter the amount you wish bet: ");
        //bet = input.nextInt();  	

    	//Values.values(Game.dealerHand);
        
    }
       
} //end class
