/*	Shawn Barnish
	P3A1
	April 5th, 2016
	April 13th, 2016 */
	
import java.util.Scanner;

public class P3A1_Barnish_3621985{
	
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);
	int wrongGuesses = 0;
	final int MAX_WRONG_GUESSES = 6;
	char letterGuessed;
	String secretWord = "golf";
	boolean guessIsInWord;
	int i;
	int secretWordLength = secretWord.length();
	String tickColor;
	//String[] secretWord2;
	
		System.out.println("Welcome to Rainbow Explosion, a hangman-type guessing game!"+
					   "\nYou have 6 attempts to guess letters in a secret word");
	
	for (i = 0; i < secretWord.length(); i++)
	{
		System.out.print("_");
	}
	
	while(wrongGuesses < MAX_WRONG_GUESSES)
	{
		System.out.println("\n\nGuess a letter.");
		letterGuessed = sc.next().charAt(0);
		guessIsInWord = (secretWord.indexOf(letterGuessed)) != -1;
		
	if (guessIsInWord == false){
		wrongGuesses++;
		System.out.println(wrongGuesses);//tickcolor needs to be here, how to make so different color as ticks ++
		}
		else{
			System.out.println("Correct!");
			
			for (i = 0; i < secretWordLength; i++)
			{
				if (secretWord.charAt(i) == letterGuessed)
				{
					System.out.print(letterGuessed);
				}
				else{
					System.out.print("_");
				}
				
			}
		}
		//System.out.println()
}
	if (wrongGuesses == MAX_WRONG_GUESSES){
		System.out.println("\nYou lose");
	}else{
		System.out.print("You win, the word was");
		System.out.println(secretWord);
		}
	}
}


		/*if (wrongGuesses == 1){
		tickColor = ("red");
	}
	if (wrongGuesses == 2){
	tickColor = ("orange");}
	if (wrongGuesses == 3){
	tickColor = ("yellow");}
	if (wrongGuesses == 4){
	tickColor = ("green");}
	if (wrongGuesses == 5){
	tickColor = ("blue");}*/
	//ignore all this, its old stuff used for reference w\
	//for loop to see if letter is in 
	
	
	//Use this section to prevent guessing the same letteer. 
	/* Set<Character> guesses = new HashSet<Character>();
		if (guesses.contains(guessedLetter)){
		system.out.println("you already guessed this leteter");}
		else{guesses.add(guessedLetter);}\
	*/
		
	/*for(int i = 0; i < correctLetters.length; i++){
			if (letterGuessed == correctLetters[i])    //|| for each one
			{
				secretword[i] = letterGuessed;
			System.out.println("Correct");
			System.out.println(secretword);}
			
			else{ wrongGuess++;
					if (wrongGuesses = 1)
					System.out.println("tick");//print out color tick
					else if (wrongGuesses = 2){}
					//tick color}
					else if (wrongGuesses = 3){}
					//tick color}
					else if (wrongGuesses = 4){}
					//ticck color}
					else if (wrongGuesses = 5){}
					//tick color}
				}
	}while(wrongGuesses < MAX_WRONG_GUESSES); //||secret word is complete
	
}
}




 //string array of underscores
					   //use for loop to check if guess is in array
					   //if in change underscore to guessed letter
					   //.length and charAt methods

					   */