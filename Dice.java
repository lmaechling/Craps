
/**
 * Manipulates multiple die.
 *
 * @author Lily Maechling
 * @version 1/18/19
 */
public class Dice
{
    private Die one;
    private Die two;
    
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
       one = new Die();
       two = new Die();
    }

    /**
     * Rolls two die.
     * 
     * @return    the sum of of the two die roll
     */
    public int[] rollTwo()
    {
        int[] result = {one.roll(), two.roll()};
        return result;
    }
}
