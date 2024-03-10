//for testing
public static void main(String[] args)
{
    //Test the Card class
    Card card = new Card(0, 9);
    //changes suit
    card.ChangeSuit(2);
    //changes value
    card.ChangeValue(14);
    //prints out the new card
    System.out.print(card.ToString);

    //Test the Deck class
    Deck deck = new Deck();
    //prints size of deck
    System.out.print(deck.SizeOfDeck);
    //prints the whole deck
    System.out.print(deck.ToString);

    //Test the Dealer class
    Dealer dealer = new Dealer();
    //still in progress

    //Test the BlackJack class
    BlackJack blackJ = new BlackJack();
    //tests value of face card
    System.out.print(deck.CardValue(11));
    //tests value of ace card
    System.out.print(deck.CardValue(14));
    //tests the IsWinner method
    blackJ.IsWinner(11,13);
    blackJ.IsWinner(20,9);
    blackJ.IsWinner(30,19);

}