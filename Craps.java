
/**
 * Models the game of Craps.
 *
 * @author Lily Maechling
 * @version 1/18/19
 */
import java.util.Scanner;
import java.util.stream.*;
public class Craps
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        Scanner in = new Scanner(System.in);

        System.out.println("Let's play a game of Craps");
        System.out.println("Do you want to play a game? (Y/N)");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("N"))
            System.out.println("Have a nice day!");
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

        boolean wannaPlay = true;
        boolean singleGame = true;
        int roll1 = 0;
        int roll2 = 0;
        int point = 0;
        while (wannaPlay)
        {
            System.out.println("Let's play! Press <Enter> key to roll.");
            while(singleGame)
            {
                String answer3 = in.nextLine();
                if (answer3.equals(""))
                {
                    roll1 = IntStream.of(dice.rollTwo()).sum();
                    System.out.println("You rolled a " + roll1);
                    if (roll1 == 7 || roll1 == 11)
                    {
                        System.out.println("Congrats! You won!");
                        singleGame = false;
                        break;
                    }
                    else if (roll1 == 2 || roll1 == 3 || roll1 == 12)
                    {
                        System.out.println("You lost.");
                        singleGame = false;
                        break;
                    }
                    else 
                    {   
                        point = roll1;
                        System.out.println("Your point is " + point + ".");
                        System.out.println("Roll again.");
                        String answer4 = in.nextLine();
                        if (answer4.equals(""))
                        {
                            roll2 = IntStream.of(dice.rollTwo()).sum();
                            System.out.println("You rolled a " + roll2 + ".");
                            if (roll2 == 7)
                            {
                                System.out.println("You lost.");
                                singleGame = false;
                                break;
                            }
                            else if(roll2 == point)
                            {
                                System.out.println("Congrats! You won!");
                                singleGame = false;
                                break;
                            }
                            else
                            {
                                System.out.println("Roll again.");
                                String answer5 = in.nextLine();
                                if (answer5.equals(""))
                                {
                                    roll2 = IntStream.of(dice.rollTwo()).sum();
                                    System.out.println("You rolled a " + roll2 + ".");
                                    if (roll2 == 7)
                                    {
                                        System.out.println("You lost.");
                                        singleGame = false;
                                        break;
                                    }
                                    else if(roll2 == point)
                                    {
                                        System.out.println("Congrats! You won!");
                                        singleGame = false;
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Roll again.");
                                        String answer6 = in.nextLine();
                                        System.out.println("You rolled a " + roll2 + ".");
                                        if (answer6.equals(""))
                                        {
                                            roll2 = IntStream.of(dice.rollTwo()).sum();
                                            if (roll2 == 7)
                                            {
                                                System.out.println("You lost.");
                                                singleGame = false;
                                                break;
                                            }
                                            else if(roll2 == point)
                                            {
                                                System.out.println("Congrats! You won!");
                                                singleGame = false;
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Roll again.");
                                                String answer7 = in.nextLine();
                                                System.out.println("You rolled a " + roll2 + ".");
                                                if (answer7.equals(""))
                                                {
                                                    roll2 = IntStream.of(dice.rollTwo()).sum();
                                                    if (roll2 == 7)
                                                    {
                                                        System.out.println("You lost.");
                                                        singleGame = false;
                                                        break;
                                                    }
                                                    else if(roll2 == point)
                                                    {
                                                        System.out.println("Congrats! You won!");
                                                        singleGame = false;
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Roll again.");
                                                        String answer8 = in.nextLine();
                                                        System.out.println("You rolled a " + roll2 + ".");
                                                        if (answer8.equals(""))
                                                        {
                                                            roll2 = IntStream.of(dice.rollTwo()).sum();
                                                            if (roll2 == 7)
                                                            {
                                                                System.out.println("You lost.");
                                                                singleGame = false;
                                                                break;
                                                            }
                                                            else if(roll2 == point)
                                                            {
                                                                System.out.println("Congrats! You won!");
                                                                singleGame = false;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else 
                {
                    System.out.println("Please roll the dice.");
                }
            }
            System.out.println("Do you want to play again? (Y/N)");
            String answerfinal = in.nextLine();
            if (answerfinal.equalsIgnoreCase("N"))
                wannaPlay=false;
            else 
            {   
                wannaPlay = true;
                singleGame = true;
            }
        }
        System.out.println("Have a nice day.");
    }
}

