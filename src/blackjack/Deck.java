package blackjack;

public class Deck {
    public static void main(String[] args) {
        String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // initialize deck
        int totalCards = Suits.length * Ranks.length;
        String[] deck = new String[totalCards];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                deck[Suits.length*i + j] = Ranks[i] + " of " + Suits[j];
            }
        }
        
        for (int i = 0; i < totalCards; i++) {
            String temp = deck[i];
            deck[i] = temp;
        }

        // print initial deck
        for (int i = 0; i < totalCards; i++) {
            System.out.println(deck[i]);
        }
        
        // shuffle
        for (int i = 0; i < totalCards; i++) {
            int r = i + (int) (Math.random() * (totalCards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < totalCards; i++) {
            System.out.println(deck[i]);
        }
    }
}
