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
        String name;
        int cash = Players.getCash(); //Player's initial amount.
        int bet; //Amount the player will bet.
        Scanner input = new Scanner(System.in);
        
        System.out.println("******** WELCOME TO BLACKJACK *********");
        
        System.out.println("Plese enter a Username: ");
        name = input.nextLine();
        Players player = new Players(name);
        player.setName(name);
        player.toString();
        
        
        System.out.println("\nEnter the anount you wish bet: ");
        bet = input.nextInt();
    }
    
} //end class
