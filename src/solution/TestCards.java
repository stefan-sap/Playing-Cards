package solution;
/**
 * TestCards.java
 * 
 */

/**
 * TestCards provides a main method to print the original sorted deck 
 * and a shuffled version.
 * 
 * @author Mitch Parry
 * @version May 6, 2013
 */
public class TestCards 
{
	/**
     * Main method prints the original and shuffled deck.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO: Test method - tests to make sure the PlayingCard and Deck
        //classes are properly implemented.
        
        Deck d = new Deck();
        //d.initialize();
        System.out.println(d.toString());
        d.shuffleDeck();
        System.out.println(d.toString());
    }
}
