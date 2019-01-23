
/**
 * Write a description of class RollTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.stream.*;

public class RollTester
{
    public static void main(String[] args)
    {
        int count = 0;
        while (count < 20)
        {
            Dice dice = new Dice();
            int roll = IntStream.of(dice.rollTwo()).sum();
            System.out.println(roll);
            count++;
        }
    }
}
