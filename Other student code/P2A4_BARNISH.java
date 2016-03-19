/*	Shawn Barnish
	P2A4
	March 15th, 2016
	March 16th, 2016 */

/*This program welcomes the user to the program with a custom welcome
message and provides information and instuctions about the program and game. */

//Imports the Scanner class
import java.util.Scanner;

import java.util.Random;

public class P2A4_BARNISH
{
	public static void main(String[] args)
	{
//Creating a String variable called "name"
//Using the Scanner class to establish "username"...what the user will input

		String name;
		Scanner username = new Scanner(System.in);

//Prompting the users name in the prompt

		System.out.print("\nWhat is your name? ");
		name = username.nextLine();

//Welcome the username with his/her name, followed by the welcome message
//Also includes the instructions for the game.
		System.out.print("\nHello ");
		System.out.println(name);
		System.out.print("\nMy name is Shawn Barnish and I am " +
						"the creator of this program.  \nThe program " +
						"introduces you to Rockymon, a computer dice game!!!");
		System.out.print("\n\nHere are the rules:\n\n" +
						"A new shooter (player) begins with his first dice roll (2 die = 2 dice)." +
						"\nThis is known as the \"big start roll\"." +
						" If the shooter rolls a 5 or 10 the player wins." +
						"\nIf the shooter rolls a 2, 4 or 11, the player loses." +
						"\nIf the shooter rolls any other number, " +
						"the \"big start roll\" becomes the \"match number\"." +
						"\nThe shooter must continue to roll the dice until " +
						"either one of two things happens:" +
						"\nThe shooter rolls a 5, and he loses." +
						"\nThe shooter rolls the match number again, and he wins.");
		System.out.println("\n\nSimple enough, right? Have fun and good luck!!!\n");

		//Prompting the user to start the game.

			System.out.println("Press \"Enter\" to play Rockymon!");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();

		//Creating the random roll of two separate die and totaling them.
		Random dice = new Random();
			int roll1 = dice.nextInt(6)+1;
			int roll2 = dice.nextInt(6)+1;
			int total = roll1 + roll2;

		//Telling the user the big start roll

		System.out.println("Here is the \"big start roll\"!!\n");
		System.out.print("\t" + total);

		if (total == 5 || total == 10)
		{System.out.println("\n\nYou win!!");}

		else
		{
			if (total == 2 || total == 4 || total ==11)
				System.out.println("\n\nYou lose...");

			else
			{
				System.out.println("\n\nYou must roll again.");
				System.out.println("Press \"Enter\" to roll again.");
				Scanner scanner2 = new Scanner(System.in);
				scanner2.nextLine();

				int roll3 = dice.nextInt(6)+1;
				int roll4 = dice.nextInt(6)+1;
				int total2 = roll3 + roll4;
				int matchNumber = total;


				while (total2 != matchNumber && total2 !=5)
				{
					System.out.println(total2);

					roll3 = dice.nextInt(6)+1;
					roll4 = dice.nextInt(6)+1;
					total2 = roll3 + roll4;

					if (total2 == 5)
					{
						System.out.println("You lose...");
						break;
					}
					else if(total2 == matchNumber)
					{
						System.out.println("You win!!");
						break;
					}
					else
					{
						System.out.println("You must roll again.");
						System.out.println("Press \"Enter\" to roll again.");

						Scanner scanner3 = new Scanner(System.in);
						scanner3.nextLine();
					}
				}//while (total2 != matchNumber || total2 != 5);

				//THIS IS YOUR SOLUTION WITH A DO...WHILE LOOP
				/*do{
					roll3 = dice.nextInt(6)+1;
					roll4 = dice.nextInt(6)+1;
					total2 = roll3 + roll4;
					matchNumber = total;
					System.out.println(total2);

					if (total2 == 5)
					{
						System.out.println("You lose...");
						break;
					}
					else if(total2 == matchNumber)
					{
						System.out.println("You win!!");
						break;
					}
					else
					{
						System.out.println("You must roll again.");
						System.out.println("Press \"Enter\" to roll again.");

						Scanner scanner3 = new Scanner(System.in);
						scanner3.nextLine();
					}
				} while(total2 != matchNumber && total2 != 5);*/
			}


		}
	}
}
