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
    	int cash = Bet.chips; //Player's initial amount.
    	
    	Players test = new Players();
        System.out.println(test);
    	System.out.println("\nEnter the amount you wish bet: ");
    	int bet = sc.nextInt(); 
    	
    	System.out.println(test);
        
    	Game game = new Game();
        game.cards();

           	
        Bet betObject1 = new Bet(bet, Game.gameWon);

        System.out.println(test);

    }
} //end class
