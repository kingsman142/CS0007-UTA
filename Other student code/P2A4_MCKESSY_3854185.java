/* Dylan McKessy
3854185
Recitation Wednesday 1PM
Start date: 3/15/16

This is my Rockymon game for Project 2.

This is activity 4 where I continue the dice program. The program will display a reminder
on how the game will continue and display the match number for the user if applicable. The
program will specify if the user wins or loses.

*/

import java.util.Scanner; // needed for the scanner class
import java.util.Random; // needed for the random class

public class P2A4_MCKESSY_3854185
{
	public static void main(String[] args)
	{
		String userName; // string variable for user's name
		Scanner keyboard = new Scanner(System.in); // keyboard variable to hold scanner
		// object
		System.out.println("\nEnter your name.\n"); // so user can input name
		userName = keyboard.nextLine(); // next line user inputs will be his name

		System.out.println("\nWelcome, " + userName + "! My name is Dylan McKessy and the following");
		System.out.println("program is a dice game. The game is called Rockymon! This is how");
		System.out.println("you play:\n");
		System.out.println("\nYou first roll 2 dice. This sum is known as the 'big start roll.'");
		System.out.println("If you roll a 5 or 10, you win. If you roll a 2, 4, or 11, you lose.");
		System.out.println("If you roll a different number, your 'big start roll,' oryour initial roll sum,");
		System.out.println("becomes your 'match number.' \nYou must then continue to roll the dice until");
		System.out.println("you either roll a 5 or your 'match number' again. If you roll a 5,");
		System.out.println("you lose the game. If you roll the 'match number,' you win!\n");

		System.out.print("\nLet's begin!");

		Random dice = new Random(); // create an instance of the random class and assign address
		int roll1 = dice.nextInt(6) + 1; // the variable for the first roll
		int roll2 = dice.nextInt(6) + 1; // the variable for the second roll
		final int rollTotal = roll1 + roll2; // the variable of the total of the two rolls

		System.out.println("\nYour 'big start roll' totals to " + rollTotal + ".");
		// to display the user's total


		if (rollTotal == (5) || rollTotal == (10)) // to determine if the user has winning numbers
		{
			System.out.print("\nYou got a " + rollTotal + ", so you win!\n");

		}
		else if	(rollTotal == (2) || rollTotal == (4)) // to determine if the user has losing numbers
		{
			System.out.print("\nYou got a " + rollTotal + ", so you lose!\n");

		}
		else if (rollTotal == (11)) // to determine if the user has losing numbers
		{
			System.out.print("\nYou got a " + rollTotal + ", so you lose!\n");

		}
		else // if the user has not won or lost yet, display this message to continue the game
		{
			System.out.println("\nYou haven't won or lost yet! Let's keep playing.\n");
			System.out.println("\nYou must roll again. If you get a 5, you lose. If your");
			System.out.println("new roll total matches your big start roll, you win!");
			System.out.println("Otherwise, we'll keep rolling.");
			System.out.println("\nYou must match " + rollTotal + " to win.\n");

			// roll the dice again

			int roll3;
			int roll4;
			int newTotal;

			do
			{
				//Generates new random numbers every time this loop iterates
				roll3 = dice.nextInt(6) + 1;
				roll4 = dice.nextInt(6) + 1;
				newTotal = roll3 + roll4;

				System.out.println("\nLet's roll again!");
				System.out.println("\nYou rolled " + newTotal + ".");

				if (newTotal == 5)
					{
					System.out.println("\nYou rolled a 5. You lose!");
					}
				else if (newTotal == rollTotal)
					{
					System.out.println("\nYou matched the match number! You win!");
					}
				else
					{
					System.out.println("\nYou must continue playing.");
					}
			} while ((newTotal!= rollTotal) && (newTotal != 5));

		}
	}
}
