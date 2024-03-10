//defines the card object
public class Card {

  //suits as ints
  public static final int HEARTS = 0;
  public static final int SPADES = 1;
  public static final int CLUBS = 2;
  public static final int DIAMONDS = 3;

  //value as ints
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;
  public static final int ACE = 14;

  //suit and value variabe
  protected int suit;
  protected int value;

  //default constructor
  //sets the suit and value to zero
  public Card() {
    suit = 0;
    value = 0;
  }

  //overloaded constructor
  //assigns suit with the given paramter
  //assigns value with zero
  public Card(int suit) {
    this.suit = suit;
    value = 0;
  }

  //overloaded constructor
  //assigns suit with the given paramter
  //assigns value with the given paramter
  public Card(int suit, int value) {
    this.suit = suit;
    this.value = value;
  }

  //copy constructor
  //gets value of given card and copies it
  public Card (Card c) {
    suit = c.suit;
    value = c.value;
  }

  //accessor
  //returns the suit of the card
  public int GetSuit() {
    return suit;
  }

  //mutator
  //assigns new suit with the given paramter
  public void ChangeSuit(int suit) {
    this.suit = suit;
  }

  //accessor
  //returns the value of the card
  public int GetValue() {
    return value;
  }

  //mutator
  //assigns new suit with the given paramter
  public void ChangeValue(int value) {
    this.value = value;
  }

  //returns the card as a string
  public String ToString() {
    String s = "";
    switch(value) {
      case 11:
        s += "Jack of ";
        break;
      case 12:
        s += "Queen of ";
        break;
      case 13:
        s += "King of ";
        break;
      case 14:
        s += "Ace of ";
        break;
      default:
        s += value + " of ";
    }
    switch(suit) {
      case 0:
        s += "Hearts";
        break;
      case 1:
        s += "Spades";
        break;
      case 2:
        s += "Clubs";
        break;
      case 3:
        s += "Diamonds";
        break;
      default:
        break;
    }
    return s;
  }

  //checks if the given Card object is the same as this Card object
  public boolean Equals(Object o){
    if(this == o){
      return true;
    }
    if(!(o instanceof Card)){
      return false;
    }
    Card f = (Card) o;
    return (this.value == f.value && this.suit == f.suit);
  }
}
