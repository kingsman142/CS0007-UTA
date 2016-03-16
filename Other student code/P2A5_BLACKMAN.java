/* Joel Blackman-Mathis, Rockymon, Start Date: 2/10/16, Last Modified: 3/2/16
This is a dice game of pure chance.  Allows for manual or automatic play.*/
import java.util.*;
public class  P2A5_BLACKMAN{
   public static void main(String[] args) {
		welcome();
		while (true){//this is an infinte loop to force the user to make one of my three specified choices
			try{
				int mode = playType();
				if (mode == 1)
					manual();
				else if (mode == 2)
					automatic();
				else if (mode == 0)
					break;//well, almost an infinite loop
			}
			//This error message is intentionally vague because it also catches InputMismatchException for 'total' in automatic()
			catch (InputMismatchException a){
			System.out.println("Bad input");
			}
		}
   }
   //manual play option.
   public static void manual() {
	int matchNumber, newRoll;
	char temp;
	/*matchNumber is the first roll and sets the win condition for rerolls.  once set, it is not changed until the game resets
	newRoll is the value of any later roll.  it is reset each time the die is rerolled
	temp is how i handle the while loop for rerolling*/
	matchNumber = roll()+roll(); //I used 2d6 instead of 1d12 because it would change the probability
	System.out.println("Your big start roll is "+matchNumber+".");
	if (matchNumber == 5 || matchNumber == 10 ){
		win();
	}
	else if (matchNumber == 2 || matchNumber == 4 || matchNumber == 11){
		lose();
	}
	else{
		System.out.print("Roll "+matchNumber+" to win, roll 5 to lose. ");
		temp = reroll();
		while (temp =='y' || temp == 'Y'){
			newRoll = roll()+roll();
			System.out.println("You rolled a "+newRoll+".");
			//this chunk checks if their reroll
			if (newRoll == matchNumber){
				temp = win();
			}
			else if (newRoll == 5){
				temp = lose();
			}
			else{
				temp = reroll();
			}
		}
	}
   }
	/*automatic play option.  if user doesn't enter an integer for total, i throw them back to the main method
	this play mode doesn't output the play-by-play.  just runs all the games and reports the results
	the functionality of the game is identical to manual style, but without the I/O */
   public static void automatic() {
	int matchNumber, newRoll, total,playerWin = 0, playerLose = 0;
	char temp;
	/*all variables the same as in manual play, except i added in playerWin and playerLose to track the score. */
	Scanner user_input = new Scanner( System.in );
	System.out.println("How many times would you like the computer to play? (enter a positive integer)");
	total = Math.abs(user_input.nextInt());//since negatives wouldn't work, i enforce absolute values
	for (int counter = 1; counter <= total; counter++)
	{
		matchNumber = roll()+roll();
		if (matchNumber == 5 || matchNumber == 10 ){
			playerWin++;//increments win count
		}
		else if (matchNumber == 2 || matchNumber == 4 || matchNumber == 11){
			playerLose++;//increments loss count
		}
		else{
			while (true){
				newRoll = roll()+roll();

				if (newRoll == matchNumber){
					playerWin++;
					break;
				}
				else if (newRoll == 5){
					playerLose++;
					break;
				}
			}
		}
	}
	System.out.printf("Out of %d games, you won %d and lost %d.%n%n",total,playerWin,playerLose);//the only output from automatic play
   }
   //personalized welcome message.  Gets user's name and explains rules
	public static void welcome(){
		String name;
		Scanner user_input = new Scanner( System.in );
		System.out.print("Enter your name: ");
		name = user_input.next( );
		System.out.println("Welcome to Rockymon, "+name+"!");
		System.out.println("The rules are simple: First you will roll two dice.  If they total to 5 or 10,  you win! Congratulations!");
		System.out.println("However, if they total 2, 4, or 11, you lose.");
		System.out.println("Any other total will become your new 'match number'.  Remember it!");
		System.out.println("From here on out, you will continue rolling the dice until you total 5 and LOSE,or roll your match number and WIN!");
	}
	//a die. returns a randome number from 1 to 6.
   	public static int roll(){
		return (int)(Math.random()*6) + 1;
	}
	//victory result. very exciting
	public static char win(){
		System.out.println("Congratulations! You win!\n");
		return 'n';
	}
	//loss result
	public static char lose(){
		System.out.println("You lose. Better luck next time.\n");
		return 'n';
	}
	//a prompt to continue rolling
	public static char reroll(){
		Scanner user_input = new Scanner( System.in );
		System.out.println("Roll again? (y/n) ");
		String temp = user_input.next();
		return temp.charAt(0);
	}
	//play type decision
	public static int playType(){
		System.out.println("Type 1 for Manual play, 2 for Automatic play, or 0 to quit.");
		Scanner user_input = new Scanner( System.in );
		int choice = user_input.nextInt();
		return choice;
	}
}
