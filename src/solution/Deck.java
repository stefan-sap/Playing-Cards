package solution;
import java.util.ArrayList;
/**
 * PlayingCard.java
 * 
 * @author Mitch Parry
 * @version May 6, 2013
 */
import java.util.Random;

/**
 * The Deck represents a 52 PlayingCards in a deck.
 * @version August 13, 2013
 * @author Mitch Parry
 */
public class Deck 
{

    /**
     * Number of cards.
     */
    public static final int NUM_CARDS = 52;
    private Random generator;

    //Fields
    private ArrayList<PlayingCard> deck = new ArrayList<>(NUM_CARDS);
    
    /**
     * Constructor creates 52 cards and adds them to ArrayList deck.
     */
    public Deck() 
    {
        // Creates a random number generator to be used in shuffleDeck()
        generator = new Random();
        initialize();
    }
    /**
     * Constructor uses a parameter to set the random seed.
     * 
     * @param seed  Seed for the random number generator.
     */
    public Deck(int seed)
    {
        generator = new Random(seed);
        initialize();
    }
    /**
     * Initializes a sorted deck.
     */
    public void initialize() 
    {
        for (int i = 0; i < SuitsAndRanks.NUMRANKS; i++)
        {
            for (int j = 0; j < SuitsAndRanks.NUMSUITS; j++)
            {
                PlayingCard c = new PlayingCard(SuitsAndRanks.ranks[i],
                    SuitsAndRanks.suits[j]);
                deck.add(c);
            }
        }
            
    }

    /**
     * Randomly shuffles the PlayingCard order in the ArrayList deck.
     */
    public void shuffleDeck() 
    {    
        // TODO: Implement the shuffling algorithm: "...that picks a 
        // random card to go last, then a random card among the 
        // remaining cards to go second to last, then a random card 
        // among the remaining cards to go third to last, ... 
        
        for (int index = NUM_CARDS - 1; index > 0; index--) 
        {
			// TODO: pick a random card to go last among the remaining 
            // (unshuffled) cards.  Hint: 
            int randomIndex = generator.nextInt(index + 1);
            PlayingCard replacementCard = deck.get(randomIndex);

            // TODO: swap
            PlayingCard originalCard = deck.get(index);
            deck.set(index, replacementCard);
            deck.set(randomIndex, originalCard);
        }
    }
    /**
     * Returns the PlayingCard at the 'index' in the deck.
     * 
     * @param index Index into the deck
     * @return  The PlayingCard at that 'index'.
     */
    public PlayingCard getCard(int index) 
    {
        return deck.get(index);
        // TODO return the playing card the 'index' in the deck.
    }
    
    /**
     * Returns a String representation of the Deck.
     * 
     * @return The string.
     */
    @Override
    public String toString() 
    {
        // TODO: Return a String with all the cards in the deck 
        // separated by an end line '\n' character.
        String cards = "";
        
        for (int i = 0; i < deck.size(); i++)
        {
            cards += deck.get(i) + " ";
        }
        
        return cards;
    }
}
