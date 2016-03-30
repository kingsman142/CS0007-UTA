import java.util.*; //Import the File class
import java.io.*; //Import the Scanner class

public class Week12{
	//throws Exception ... this essentially means exceptions, or errors, can be thrown out of the method (in this case, main)
	//so we don't have to worry about them.
	//Java is requiring this because we're using the File class and it might give us errors if the file does not exist.
	public static void main(String[] args) throws Exception{
		File data = new File("data.txt"); //Store the data file in a File object
		Scanner sc = new Scanner(data); //Use Scanner to read from the file like you used Scanner to read the
										//keyboard input, using System.in, from previous projects.

		//This loops through the file, using my Scanner variable, reads every line one by one,
		//and prints out each line.
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
	}
}
