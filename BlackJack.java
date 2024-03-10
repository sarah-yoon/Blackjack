//methods that the main class will need to run the game
public class BlackJack{

    //constructor class
    public BlackJack()
    {
        Deck deck = new Deck();
    }

    //returns the value of a card for blackjack
    public int CardValue(Card c)
    {
        if(c.value < 10 && c.value > 14)
        {
            return 10;
        }
        if(c.value == 14)
        {
            return 11;
        }
        else
        {
            return c.value;
        }
    }

    //checks if the player busts or not
    public boolean Bust(int value)
    {
        return value > 21;
    }

    //compares the two hands and returns true if handOne is higher
    //returns false is handOne is lower
    public boolean IsWinner(int handOne, int handtwo)
    {
        if(handOne > handtwo && handOne < 22)
        {
            return true;
            System.out.print("You won! :)");
        }
        return false;
        System.out.print("Maybe next time...");
    }

}