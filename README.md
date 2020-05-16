# FinalProject
PROJECT TITLE: BlackJack

PURPOSE OF PROJECT: A BlackJack game made in Programming 1 as a final project.
This program alows the player to play a simplified version of the game BlackJack with the computer.

DATE: 15/05/2020

AUTHORS: Maria Ramlochan, Nirdesh shrestha

JavaDoc: C:\Users\maria\OneDrive\Documents\NetBeansProjects\BlackJack\dist\javadoc\blackjack\package-summary.html

USER INSTRUCTIONS: How to play:
- PLayer must first enter their name to begin the name.
- Then enter the amount they wish to bet. If they win against the dealer
  the amount will add to their current amount. If they lose against the dealer 
  the amount will decrease from their total.
- If the player has more than 21 they are busted (they lose).
- If the dealer has more than 21, the player will win.
- If neither the player or dealer has 21, the one with the most values win.

PROBLEMS: Our challenged was to distribute two cards from the deck to the player and the dealer 
and to add additional card to each of their hands. We solved this problem by creating a unique 
for loop and using modulus to get the remainder to distribute the cards in turns (player then dealer).
We also had trouble placing cards into the player's and dealer's hand. We solved this problem by using 
the .lenght method from the array deck.
Another problems was to get the values for each cards in player's and dealer's hand. We conquered this 
challenge by creating a Values class and using a switch statements.
We had difficulties increasing and decreasing the amount of cash. We manage to solve this
by creating a bunch of if/else statements and getting and setting a GameWon method in our game class.
Most of our problems were acomplished by having a few classes to execute and initializing methods that 
came toghether in our Game class and running from our BlackJack class.
This was a very challenging program yet enjoyable.
It helps us explore other options and lines of coding.

