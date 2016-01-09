/*James Hahn
	Project 1, Activity 3
		This activity creates all of its variables, prompts the user for their name, and outputs
		a welcome message to the console.
*/
import java.util.*;

public class P1_A3{
	//Prompts the user for their name to be used in the welcome message
	public static String promptUserName(){
		Scanner sc = new Scanner(System.in); //Create a scanner for user input

		System.out.print("Please enter your name: "); //Prompt user
		String userName = sc.next(); //Take in the next word that is entered

		return userName;
	}

	public static void main(String[] args){
		double rateHourly = 0.0; //Regular hourly pay rate
		double rateOvertime = 0.0; //Overtime hourly pay rate
		double rent = 0.0; //Cost of rent
		double electricBillPercent = 0.0; //Percent of bill that goes to electric
		double waterBillPercent = 0.0; //Percent of bill that goes to water
		double sewerBillPercent = 0.0; //Percent of bill that goes to sewer
		double gasBillPercent = 0.0; //Percent of bill that goes to gas
		double foodBudget = 0.0; //Total budget for food
		double entertainBudget = 0.0; //Total budget for entertainment
		double carExpensesMonthly = 0.0; //Total monthly car expenses
		int hoursWorkedRegular = 0; //Regular hours worked
		int hoursWorkedOvertime = 0; //Overtime hours worked
		String name = promptUserName(); //Call the promptUserName method to store the user's name

		System.out.printf("My name is %s.  This program will create a budget calculator.\n", name);
	}
}
