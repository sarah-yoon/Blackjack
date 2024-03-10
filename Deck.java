import java.util.LinkedList;

//makes a deck with 60 cards
public class Deck {

  //LinkedList that holds the deck
  public LinkedList<Card> m_cards = new LinkedList<Card>();

  //default constructor
  //sets a normal deck of 52 cards
  public Deck() {
    for(int j = 0; j < 4; j++)
      for(int i = 2; i < 15; i++) {
        Card c = new Card(j, i);
        m_cards.add(c);
      }
  }

  //copy constructor
  //gets value of given deck and copies it
  public Deck(Deck d) {
    for (int i = 0; i < d.m_cards.size(); i++) {
      m_cards.add(d.m_cards.get(i));
    }
  }

  //returns each card in the deck as a string
  public String ToString() {
    String s = "";
    for (int i = 0; i < m_cards.size(); i++) {
      s += m_cards.get(i).toString() + "\n";
    }
    return s;
  }

  //returns the size of the deck
  public Integer SizeOfDeck() {
    return Integer.valueOf(m_cards.size());
  }

  //gets a random card and removes it from the deck
  //returns the card
  public Card Deal() {
    int pos = (int)((Math.random() *  m_cards.size()));
    Card c = new Card(m_cards.get(pos));
    m_cards.remove(pos);
    return c;
  }

}
