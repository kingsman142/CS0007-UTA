import java.util.*;
import java.io.*;

public class P3_A4{
	private static String word = "";
	private static int numTicks = 0;
	private static String[] colors = {"None", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE"};
	private static ArrayList<String> guessedLetters = new ArrayList<String>();
	private static int numBlanks = 0;

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the filename of words to read from: ");
		String filename = sc.nextLine();
		WordList wordList = new WordList();
		wordList.readWordsFromFile(filename);
		word = wordList.getRandomWord();

		String letterInput = "";
		char[] wordArray = new char[word.length()];
		String playAgain = "yes";

		do{
			for(char b: wordArray){
				b = '_';
			}

			numBlanks = 0;
			System.out.println("\nBomb color: " + colors[numTicks]);
			System.out.print("Guess a letter: ");
			letterInput = sc.nextLine();
			if(!convert(wordArray, letterInput)) numTicks++;
			printArr(wordArray);
			if(numTicks == colors.length-1){
				System.out.println("THE BOMB IS PURPLE! BOOM! YOU LOSE! The word was: " + word);
				System.out.print("Would you like to play again (yes or no)? ");
				playAgain = sc.nextLine();
				word = wordList.getRandomWord();
				wordArray = new char[word.length()];
				numTicks = 0;
				numBlanks = 0;
			} else if(numBlanks == 0){
				System.out.println("\nWOW! Congratulations! You Won! The word was: " + word);
				System.out.print("Would you like to play again (yes or no)? ");
				playAgain = sc.nextLine();
				word = wordList.getRandomWord();
				wordArray = new char[word.length()];
				numTicks = 0;
				numBlanks = 0;
				guessedLetters.clear();
			}
		} while(playAgain.toLowerCase().equals("yes"));
	}

	public static boolean convert(char[] wordArr, String letter){
		int counter = 0;
		char lett;
		boolean foundLetter = false;
		if(letter.length() > 1){
			if(letter.equals(word)){
				numBlanks = 0;
				int count = 0;
				for(char a: word.toCharArray()){
					lett = letter.charAt(count);
					wordArr[count++] = lett;
				}
				return true;
			} else return false;
		} else lett = letter.charAt(0);

		if(guessedLetters.contains(letter)){
			System.out.println("You already guessed that!");
			return true;
		} else{
			guessedLetters.add(letter);
		}

		for(char a: word.toCharArray()){
			if(a == lett){
				wordArr[counter] = lett;
				foundLetter = true;
			}
			counter++;
		}

		return foundLetter;
	}

	public static void printArr(char[] word){
		for(char a: word){
			if(a == '\0'){
				System.out.print("_ ");
				numBlanks++;
			} else System.out.print(a + " ");
		}
		System.out.println();
	}
}
