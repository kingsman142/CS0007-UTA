import java.util.*;
import java.io.*;

/*
Rainbow Explosion Activity 2
This activity holds a single secret word and has the user try to guess the letters in
the secret word until they discovery what the full word is.
Author Name: Mallory Perillo
Start Date: 04/07/16
Modification Date: 04/17/16
**/

public class P3A2_PERILLO_3888758
{
	static String playAgain;

public static void printWord(String s, boolean[] b)
	{
		for(int i = 0; i < b.length; i++)
		{
			if(b[i] ==  true)
				System.out.print(s.charAt(i));
			else
				System.out.print("_ ");
		}
		System.out.println("");
	}

	public static void tickCount(int t)
	{
		if(t == 1)
			System.out.println("The bomb is now red");
		else if(t == 2)
			System.out.println("The bomb is now orange");
		else if(t == 3)
			System.out.println("The bomb is now yellow");
		else if(t == 4)
			System.out.println("The bomb is now green");
		else if(t == 5)
			System.out.println("The bomb is now blue");
		else
			System.out.println("The bomb is now purple...BOOM!");
	}

	public static boolean findFalse(boolean[] b)
	{
		for(int i = 0; i < b.length; i++)
			{
				if(b[i] == false)
					return false;
			}
			return true;
	}

	public static void main(String[] args)
	{
	do
	{
		String word= "";
		int randomNumber;

		try{
		BufferedReader reader = new BufferedReader(new FileReader("randomwords.txt"));
		List<String> lines = new ArrayList<String>();

		String line = reader.readLine();

		while(line != null)
		{
			lines.add(line);
			line = reader.readLine();
		}
		Random rand = new Random();
		randomNumber = rand.nextInt(lines.size());
		word = lines.get(randomNumber);


		}catch(IOException e){e.printStackTrace();}



		int wrongTally = 0;

		boolean[] guess = new boolean[word.length()];

		System.out.println("Welcome to Rainbow Explosion!");
		System.out.println("The goal of the game is to guess the secret word.");
		System.out.println("In order to do this, you must guess the letters in the word.");
		System.out.println("For each letter you guess wrong, the color bomb ticks down...");
		System.out.println("You only have 6 chances to guess a wrong number before"
							+ "it explodes");
		System.out.println("Good luck!");

		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < guess.length; i++)
		{
			guess[i] = false;
		}


		do
		{
			System.out.println("Please guess a letter");

			String input = scan.nextLine();

			char c = input.charAt(0);

			boolean inWord = false;

			for(int i = 0; i < word.length(); i++)
			{
				if(Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(c))
				{
					guess[i] = true;
					inWord = true;
				}

			}

			if(inWord == false)
			{
				wrongTally++;
				tickCount(wrongTally);
			}

			if(wrongTally != 6)
				printWord(word, guess);

		}while(!findFalse(guess) && wrongTally != 6);

		if(wrongTally ==6)
			System.out.println("Sorry, the bomb exploded. You lost.");
		else
			System.out.println("Congratulations, you guessed the secret word. You win!");

		Scanner sc = new Scanner(System.in);

		//gives player the option to play game again
			System.out.println("Do you want to play again?");
			System.out.println("Type Y for yes or N for no.");
			playAgain = sc.nextLine();//scanner retrieves the user's answer
		}while (playAgain.equals("Y")||playAgain.equals("y")); //player must answer Y to make game repeat
}
}
