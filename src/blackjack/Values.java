/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author maria
 */
public class Values {
    
        public static int values(String card1) {
        int value = 0;
        String card = card1;
        	switch(card) {
            	case "Ace of Spades": 
            		value = 1;
            		System.out.println("h" + value);
            		break;
                 case "Ace of Diamonds": 
            		value = 1;
            		System.out.println(value);
            		break;
                 case "Ace of Hearts": 
            		value = 1;
            		System.out.println(value);
            		break;
                 case "Ace of Clubs": 
            		value = 1;
            		System.out.println(value);
            		break;
            	case "2": 
            		value = 2;
            		System.out.println(value);
            		break;
	            case "3": 
	            	value = 3;
	                System.out.println(value);
	            	break;
	            case "4": 
	            	value = 4;
	                System.out.println(value);
	            	break;
	            case "5": 
	            	value = 5;
	                System.out.println(value);
	            	break;
	            case "6": 
	            	value = 6;
	                System.out.println(value);
	            	break;
	            case "7": 
	            	value = 7;
	                System.out.println(value);
	            	break;
	            case "8": 
	            	value = 8;
	                System.out.println(value);
	            	break;
	            case "9": 
	            	value = 9;
	                System.out.println(value);
	            	break;
	            case "10": 
	            	value = 10;
	                System.out.println(value);
	            	break;
	            case "Jack":
	            	value = 10;
	                System.out.println(value);
	            	break;
	            case "Queen": 
	            	value = 10;
	                System.out.println(value);
	                break;
	            case "King": 
	            	value = 10;
	                System.out.println(value);
	                break;  
	            default:
	            	value = 0;
	            	System.out.println("hello");
	    }
        
        return value;
        
    } 
    
}
