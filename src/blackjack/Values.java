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
        public static int values(String[] Cards) {
        int value = 0;
        for(int i=0; i < 2 ; i++) {
        	switch(Cards[i]) {
            	case "Ace": 
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
	    }
        return value;
        
    } 
    
}
