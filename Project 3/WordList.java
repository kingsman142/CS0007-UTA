import java.util.*;
import java.io.*;

public class WordList{
	private static ArrayList<String> listOfWords = new ArrayList<String>();
	private static String word = null;

	public WordList(){

	}

	public void readWordsFromFile(String filename) throws Exception{
		File f = new File(filename);
		Scanner sc = new Scanner(f);

		while(sc.hasNextLine()){
			listOfWords.add(sc.nextLine());
		}
	}

	public String getRandomWord(){
		Random rand = new Random();
		int index = Math.abs(rand.nextInt()) % listOfWords.size();
		word = listOfWords.get(index);
		return word;
	}

	public String getWord(){
		return word;
	}
}
