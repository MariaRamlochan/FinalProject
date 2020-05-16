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
		/**
		 * Method to return the value of the Card and use in in game Class
		 * @param card1
		 * @return
		 */
        public static int value(String card1) {
        int value = 0;
        String card = card1;
        int index = card.indexOf(' ');
        card = card.substring(0, index);
        	switch(card) {
            	case "Ace": 
            		value = 1;
            		break;
            		
            	case "2": 
            		value = 2;
            		break;
            		
	            case "3": 
	            	value = 3;
	            	break;
	            	
	            case "4": 
	            	value = 4;
	            	break;
	            	
	            case "5": 
	            	value = 5;
	            	break;
	            	
	            case "6": 
	            	value = 6;
	            	break;
	            	
	            case "7": 
	            	value = 7;
	            	break;
	            	
	            case "8": 
	            	value = 8;
	            	break;
	            	
	            case "9": 
	            	value = 9;
	            	break;
	            	
	            case "10": 
	            	value = 10;
	            	break;
	            	
	            case "Jack":
	            	value = 10;
	            	break;
	            	
	            case "Queen": 
	            	value = 10;
	                break;
	                
	            case "King": 
	            	value = 10;
	            	
	                break;  
	    }  return value;    
    } 
}
