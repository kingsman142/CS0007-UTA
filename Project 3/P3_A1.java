import java.util.*;

public class P3_A1{
	private static String word = "balloon";
	private static int numTicks = 0;
	private static String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String letterInput = "";
		char[] wordArray = new char[word.length()];
		for(char b: wordArray) b = '_';

		do{
			System.out.println("\nBomb color: " + colors[numTicks]);
			System.out.print("Guess a letter: ");
			letterInput = sc.nextLine();
			if(!convert(wordArray, letterInput)) numTicks++;
			printArr(wordArray);
		} while(!letterInput.equals(""));
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
			if(a == '\0') System.out.print("_ ");
			else System.out.print(a + " ");
		}
		System.out.println();
	}
}
