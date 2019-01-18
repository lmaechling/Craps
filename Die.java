
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
