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
        // TODO code application logic here
        System.out.println("******** WELCOME TO BLACKJACK *********");
        
        int cash = 2000; //Player's initial amount.
        int bet; //Amount the player will bet.
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou have an initial value of: " + cash + "$");
        System.out.println("\nEnter the anount you wish bet: ");
        bet = input.nextInt();
    }
    
}
