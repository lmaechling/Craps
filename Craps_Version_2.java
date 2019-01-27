
/**
 * Models the game of Craps, but more methods.
 *
 * @author Lily Maechling
 * @version 1/18/19
 */
import java.util.Scanner;
import java.util.stream.*;

public class Craps_Version_2
{
    public static void main(String[] args)
    {
        System.out.println("Let's play a game of Craps");
        giveInstructions();
        while (wannaPlay())
           startGame(); 
    }

    public static boolean wannaPlay()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play a game? (Y/N)");

        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("N"))
        {
            System.out.println("Have a nice day!");
            return false;
        }
        else if (answer.equalsIgnoreCase("Y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void giveInstructions()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you need instructions? (Y/N)");
        String answer2 = in.nextLine();
        if (answer2.equalsIgnoreCase("Y"))
        {
            System.out.println("1. Roll two dice.");    
            System.out.println("    a. If total is 7 or 11, you win!.");
            System.out.println("    b. If total is 2,3,or 12, you lose.");
            System.out.println("    c. Otherwise, total becomes your 'point' are roll again."); 
            System.out.println("2. Roll again.");   
            System.out.println("    a. If total is 7, you lose.");
            System.out.println("    b. If total is your 'point', you win!.");
            System.out.println("    c. Roll again.");
        }
    }

    public static int rollTwo()
    {
        Dice dice = new Dice();
        return IntStream.of(dice.rollTwo()).sum();
    }

    public static void startGame()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play! Press <Enter> key to roll.");
        String answer = in.nextLine();
        int roll = rollTwo();
        int point = 0;
        boolean done = false;
        if (answer.equals(""))
        {
            System.out.println("You rolled a " + roll);
            if (roll == 7 || roll == 11)
            {
                System.out.println("Congrats! You won!");
                done = true;
            }
            else if (roll == 2 || roll == 3 || roll == 12)
            {
                System.out.println("You lost.");
                done = true;
            }
            else
            {
                point = roll;
                System.out.println("Your point is " + roll);
            }
        }
        else 
        {
            System.out.println("Invalid Response");
            done = true;
        }
        while(!done)
        {
            System.out.println("Press <Enter> key to roll again.");
            String answer2 = in.nextLine();
            roll = rollTwo();
            if (answer.equals(""))
            {
                System.out.println("You rolled a " + roll);
                if (roll == 7)
                {
                    System.out.println("You lost");
                    done = true;
                }
                else if (roll == point)
                {
                    System.out.println("Congrats! You won!.");
                    done = true;
                }
            }
            else 
            {
                System.out.println("Invalid Response. Goodbye!");
                done = true;
            }
        }
    }
}
