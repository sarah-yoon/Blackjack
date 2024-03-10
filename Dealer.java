import java.util.LinkedList;

//dealer class that deals cards
public class Dealer {

  //makes a Deck object
  private Deck d;

  //assigns the Deck object to a default deck
  public Dealer() {
    d = new Deck();
  }

  //deals the number of cards that is given by the paramter
  //adds the cards the a LinkedList
  //the LinkedList is returned
  public LinkedList<Card> Deals(int n) {
    LinkedList<Card> newList = new LinkedList<Card>();
    if(d.m_cards.size() == 0) {
      return newList;
    }
    for(int i = 0; i < n; i++) {
      newList.add(d.deal());
    }
    return newList;
  }

  //returns size of deck
  public Integer SizeOfDeck() {
    return d.SizeOfDeck();
  }

  //returns the deck as a String
  public String ToString() {
    return d.m_cards.ToString();
  }

}
