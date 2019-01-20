
/**
 * Models a singular die.
 *
 * @author Lily Maechling
 * @version 1/18/19
 */
public class Die
{
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }

    /**
     * Rolls a six-sided die.
     *
     *@return an int result of the roll.
     */
    public int roll()
    {
        roll = (int) (Math.random()*6+1);
        return roll;
    }
}
