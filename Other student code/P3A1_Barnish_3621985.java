/*	Shawn Barnish
	P3A1
	April 5th, 2016
	April 20th, 2016 */

import java.util.Scanner;
import java.util.Arrays;

public class P3A1_Barnish_3621985{

	public static void main(String[] args)
	{

	Scanner sc = new Scanner(System.in); //Scanner to get user letterGuessed
	int wrongGuesses = 0; //keeps track of users wrong guesses
	final int MAX_WRONG_GUESSES = 6; // maximum wrong guesses
	char letterGuessed; // stores the letter the user guessed
	String secretWord = "golf"; //secret word is only this word in this file
	boolean guessIsInWord; // used to see if letterGuessed is in the word
	int underscores = 0;
	int i; // used for the for loops
	int secretWordLength = secretWord.length(); // length of the secret word
	char[] wordSoFar = new char[secretWord.length()]; // array of the letters and underscores of the word.
	String[] colors = {"None", "Red", "Orange", "Yellow", "Green", "Blue", "Purple, BOOM!!"}; //array of the colors of the bomb

	//Welcome Message
		System.out.println("\nWelcome to Rainbow Explosion, a hangman-type guessing game!"+
					   "\nYou have 6 attempts to guess letters in a secret word.\n"+
					   "Here is your word: \n");

	//Initial Showing of the Blank Word
	for (i = 0; i < secretWord.length(); i++)
	{
		wordSoFar[i] = '_';
	}
	//While loop for the content of  the game.  While the user hasn't won or lost, the game continues.
	while(wrongGuesses < MAX_WRONG_GUESSES && underscores != 0) {
		underscores = 0;
		//Keeping track of the underscores so when that equals 0  the loop ends user wins
	for (i = 0; i <wordSoFar.length; i++)
	{
		if(wordSoFar[i]== '_'){underscores++;}
	}
		System.out.print(wordSoFar);
		System.out.println("\n\nGuess a letter.");
		letterGuessed = sc.next().toLowerCase().charAt(0);
		guessIsInWord = (secretWord.indexOf(letterGuessed)) != -1;


	if (guessIsInWord == false){
		wrongGuesses++;
		System.out.println("\nThat is incorrect. \nCurrent bomb color: " + colors[wrongGuesses]+
							"\nHere is the word so far: \n");
		}
		else{
			System.out.println("\nThat is correct!\nHere is the word so far: \n");

			for (i = 0; i < secretWordLength; i++)
			{
				if (secretWord.charAt(i) == letterGuessed)
				{
					wordSoFar[i] = letterGuessed;
				}
			}
		}
}
	if (wrongGuesses == MAX_WRONG_GUESSES){
		System.out.println("\nThe Bomb Exploded.\nYou lose!!!");
	}else{
		System.out.print("You win, the word was:\n\n");
		System.out.println(secretWord);
		}
	}
}


		/*


	//Use this section to prevent guessing the same letteer.
	/* Set<Character> guesses = new HashSet<Character>();
		if (guesses.contains(guessedLetter)){
		system.out.println("you already guessed this leteter");}
		else{guesses.add(guessedLetter);}\
	*/

	/*

//ArrayList<String> words = new ArrayList<String>(); this for activity 2


					   */