import java.util.*;

class P2A5_SCHULIEN //creates class for rockymon
{
	public static void main(String[] args) //creates main method
	{
		Scanner keyboard = new Scanner(System.in);	 // Create a Scanner object to read input.
		int playType = introduction();
		if(playType == 1)
			rockymon();
		else
		{
			System.out.printf("Ok then. The computer will play for you. \n");
			System.out.printf("Please input how many times you would like the computer to play Rockymon. \n");
			System.out.printf("Please key your answer in integer format, thank you. \n");

			int computer = keyboard.nextInt();

			System.out.printf("\n");
			System.out.printf("Ok. The computer will simulate " + computer + " games.");
			System.out.printf("One moment please.");

			int winLoseCount = computerPlay(computer);

			System.out.printf("\n");
			System.out.printf("\n");
			System.out.printf("Thanks for playing Rockymon! \n");


		}
	}


	public static int introduction()
	{
		String name;
		Scanner kbIntroduction = new Scanner(System.in);

		System.out.printf("\n");
		System.out.printf("Hello! Rockymon is a dice game that can be played manually or automatically by the computer. \n");
		System.out.printf("\n");
		System.out.printf("Would you like to play manually, or would you like to have to computer run for you? \n");
		System.out.printf("Please key '1' if you would like to play or '2' to have the computer play. \n");

		String computer = kbIntroduction.nextLine();

		if (computer.equals("1"))
		{

		System.out.printf("Hey there, Shooter, what's your name? "); //Prompts end-user to input name.
		name = kbIntroduction.nextLine();



		System.out.printf("\n"); // Formatting
		System.out.printf("\t\t Nice to meet ya, Shooter %s, my name is Mike and welcome to Rockymon!  \n", name); // Use's user-input name to greet the end user
		System.out.printf("Rockymon is a dice game in which the 'Shooter' rolls two die, shooting for specific totals in order to win. \n"); // Prints brief description about what the game will do.
		System.out.printf("\n"); // Formatting
		System.out.printf("\n"); // Formatting



		/* The following section explains the
			rules and instructions of Rockymon
			to the end-user.
		*/

		System.out.printf("INSTRUCTIONS: \n");
		System.out.printf("\t %s will begin the game with the 'Big Start Roll'. \n", name);
		System.out.printf("\t If the shooter rolls a 5 or 10 the shooter wins. \n");
		System.out.printf("\t If the shooter rolls a 2, 4, or 11, the shooter looses. \n");
		System.out.printf("\t If the shooter rolls any other number, the 'Big Start Roll' becomes the 'Match Number'. \n");
		System.out.printf("At this point, the shooter must continue to roll the dice until either one of two things happens: \n");
		System.out.printf("\t The shooter rolls a 5, he loses. \n");
		System.out.printf("\t The shooter rolls the 'Match Number' again, and he wins! \n");
		System.out.printf("\n"); // Formatting
		System.out.printf("Got it? \n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		}

		return Integer.parseInt(computer);

	}



	public static boolean rockymon()
	{

		Scanner kbRockymon = new Scanner(System.in);
		int dieOne;
		int dieTwo;
		int roll;
		int matchNumber;

		Random dice = new Random();
		dieOne = dice.nextInt(6)+1;
		dieTwo = dice.nextInt(6)+1;
		roll = dieOne + dieTwo;

		System.out.printf("Ready to roll? \n");
		System.out.printf("\n");
		System.out.printf("\n");



		System.out.printf("Your BIG START ROLL is: \t " + roll + "\n");

		if (roll == 5 || roll == 10)
		{
			System.out.printf("You win! \n");

		}

		else if (roll == 2 || roll == 4 || roll == 11)
	 	{
			System.out.printf("You lose! \n");

		}

		else
		{

		System.out.printf("Your BIG START ROLL is now your MATCH NUMBER! \n");
		System.out.printf("Let's roll again. Remember, if you roll your match number, you win! \n");
		System.out.printf("Good luck! \n");

			do
			{
				System.out.printf("Press '1' to roll again. \n");
				kbRockymon.nextLine();
				dieOne = dice.nextInt(6)+1;
				dieTwo = dice.nextInt(6)+1;
				matchNumber = dieOne + dieTwo;

				System.out.printf("Your roll is: \t" + matchNumber + "\n");
			}

			while (matchNumber != 5 && matchNumber != roll);

			if (matchNumber == 5)
			{
				System.out.printf("You lose! \n");

			}

			else if (matchNumber == roll)
			{
				System.out.printf("You win! \n");
			}


		}
			System.out.printf("Would you like to play rockymon again? \n");
			System.out.printf("Please key '1' to play again, or '2' if you would like to quit \n");

			String again = kbRockymon.nextLine();

			if(again.equals("1"))
			{
				return true;
			}
			else
			{
				return false;
			}

	}

	public static int computerPlay(int computer)
	{
		int winCount = 0;
		int loseCount = 0;

		for(int x = computer; x != 0 ; x--)
		{

		int compDieOne;
		int compDieTwo;
		int compRoll;
		int compMatchNumber;
		Random dice = new Random();

		compDieOne = dice.nextInt(6)+1;
		compDieTwo = dice.nextInt(6)+1;
		compRoll = compDieOne + compDieTwo;

		if (compRoll == 5 || compRoll == 10)
			winCount++;

		if (compRoll == 2 || compRoll == 4 || compRoll == 11)
			loseCount++;

		else
		{
			compMatchNumber = compRoll;

			do
			{
			compDieOne = dice.nextInt(6)+1;
			compDieTwo = dice.nextInt(6)+1;
			compRoll = compDieOne + compDieTwo;
			}while(compRoll!=5 || compRoll!=compMatchNumber);

			if (compRoll == 5)
				loseCount++;

			else
				winCount++;
			}
		}
		

	}

}
