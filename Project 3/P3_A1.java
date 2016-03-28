import java.util.*;

public class P3_A1{
	private static String word = "balloon";
	private static int numTicks = 0;
	private static String[] colors = {"None", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE"};
	private static int numBlanks = 0;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String letterInput = "";
		char[] wordArray = new char[word.length()];
		for(char b: wordArray){
			b = '_';
		}

		do{
			numBlanks = 0;
			System.out.println("\nBomb color: " + colors[numTicks]);
			System.out.print("Guess a letter: ");
			letterInput = sc.nextLine();
			if(!convert(wordArray, letterInput)) numTicks++;
			if(numTicks == colors.length-1) System.out.println("THE BOMB IS PURPLE! BOOM! YOU LOSE!");
			printArr(wordArray);
		} while(numTicks < colors.length-1 && numBlanks > 0);

		if(numTicks < colors.length-1) System.out.println("\nWOW! Congratulations! You Won! The word was: " + word);
		System.out.print("Enter anything to quit: ");
		sc.next();
	}

	public static boolean convert(char[] wordArr, String letter){
		int counter = 0;
		char lett;
		boolean foundLetter = false;
		if(letter.length() > 1) return false;
		else lett = letter.charAt(0);

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
