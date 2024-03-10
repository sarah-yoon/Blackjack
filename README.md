# Blackjack
### Rules
- Players are given  two cards and choose to either “hit” or “stand”
- The dealer also has two cards in their hand, and one of them is face up.
- If a player’s cards pass 21, they lose the game

### Running the application
- Make sure python3 is installed
- Clone this repository
- Run it on an IDE like Visual Studio

### Unit Tests
- The main class should have unit tests that may be edited and run to test each method

### Issues
1. The CardValue method isn't complete for the Ace card. Make sure the player is able to choose between a 1 and 11 when they play an Ace.
2. The Dealer class is missing a shuffle method. Use the Deck object to thoroughly shuffle through a card.
3. Find a better way to number the value of the cards. Currently, the face cards are values 11-13. This is so that the cards can be easily distributed into a deck. However, this provides an extra step in Blackjack because the values are different. Face cards are 11-13 and an Ace is 1 or 11.
4. Implement a betting system. In the current state of the program, the game doesn't include betting and is just a win or lose game. 
5. f
