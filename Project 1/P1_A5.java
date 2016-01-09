/*James Hahn
	Project 1, Activity 5
		This activity creates all of its variables, prompts the user for their name, outputs
		a welcome message to the console, and collects the values for each variable from the user.
		Also outputs the total budget statistics.
*/
import java.util.*;

public class P1_A5{
	static double rateRegular = 0.0; //Regular hourly pay rate
	static double rateOvertime = 0.0; //Overtime hourly pay rate
	//All of these variables are on a monthly basis
	static double rent = 0.0; //Cost of rent
	static double electricPayPercent = 0.0; //Percent of pay that goes to electric
	static double waterPayPercent = 0.0; //Percent of pay that goes to water
	static double sewerPayPercent = 0.0; //Percent of pay that goes to sewer
	static double gasPayPercent = 0.0; //Percent of bill that goes to gas
	static double foodBudget = 0.0; //Total budget for food
	static double entertainBudget = 0.0; //Total budget for entertainment
	static double carExpenses = 0.0; //Total monthly car expenses
	static int hoursWorkedRegular = 0; //Regular hours worked
	static int hoursWorkedOvertime = 0; //Overtime hours worked

	static double foodPayPercent = 0.0; //Percentage of pay that goes to food
	static double entertainPayPercent = 0.0; //Percentage of pay that goes to entertainment
	static double carPayPercent = 0.0; //Percentage of pay that goes to car
	static double monthlyElectric = 0.0; //How much money per month is spent on electricity
	static double monthlyWater = 0.0; //How much money per month is spent on water
	static double monthlySewer = 0.0; //How much money per month is spent on sewer
	static double monthlyGas = 0.0; //How much money per month is spent on gas
	static double monthlyExpenses = 0.0; //Total amount of monthly expenses
	static double monthlyPay = 0.0; //Total pay per month
	static double monthlyNetPay = 0.0; //Total pay per month after deductions

	//Prompts the user for their name to be used in the welcome message
	public static String promptUserName(){
		Scanner sc = new Scanner(System.in); //Create a scanner for user input

		System.out.print("Please enter your name: "); //Prompt user
		String userName = sc.next(); //Take in the next word that is entered

		return userName;
	}

	//Prompts the user for the values of all the variables
	//Every variables uses their class to parse their value from a string
	public static void promptVariables(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the normal hourly rate: $");
		rateRegular = Double.parseDouble(sc.next());

		System.out.print("Enter the overtime hourly rate: $");
		rateOvertime = Double.parseDouble(sc.next());

		System.out.print("Enter the cost of rent (per month): $");
		rent = Double.parseDouble(sc.next());

		System.out.print("Enter the percentage of your pay that goes to electricity: ");
		electricPayPercent = Double.parseDouble(sc.next());

		System.out.print("Enter the percentage of your pay that goes to water: ");
		waterPayPercent = Double.parseDouble(sc.next());

		System.out.print("Enter the percentage of your pay that goes to sewage: ");
		sewerPayPercent = Double.parseDouble(sc.next());

		System.out.print("Enter the percentage of your pay that goes to gas: ");
		gasPayPercent = Double.parseDouble(sc.next());

		System.out.print("Enter your total food budget: $");
		foodBudget = Double.parseDouble(sc.next());

		System.out.print("Enter your total entertainment budget: $");
		entertainBudget = Double.parseDouble(sc.next());

		System.out.print("Enter your monthly car expenses: $");
		carExpenses = Double.parseDouble(sc.next());

		System.out.print("Enter regular hours worked: ");
		hoursWorkedRegular = Integer.parseInt(sc.next());

		System.out.print("Enter overtime hours worked: ");
		hoursWorkedOvertime = Integer.parseInt(sc.next());
	}

	//Prints out every variables using the printf method to format money and percentages
	public static void outputVariables(){
		System.out.printf("\nRegular hourly wage: $%.2f - double\n", rateRegular);
		System.out.printf("Overtime hourly wage: $%.2f - double\n", rateOvertime);
		System.out.printf("Monthly rent: $%.2f - double\n", rent);
		System.out.printf("Electricity pay percentage: %.2f%% - double\n", electricPayPercent);
		System.out.printf("Water pay percentage: %.2f%% - double\n", waterPayPercent);
		System.out.printf("Sewage pay percentage: %.2f%% - double\n", sewerPayPercent);
		System.out.printf("Gas pay percentage: %.2f%% - double\n", gasPayPercent);
		System.out.printf("Monthly food budget: $%.2f - double\n", foodBudget);
		System.out.printf("Monthly entertainment budget: $%.2f - double\n", entertainBudget);
		System.out.printf("Monthly car expenses: $%.2f - double\n", carExpenses);
		System.out.printf("Regular hours worked: $%d - int\n", hoursWorkedRegular);
		System.out.printf("Overtime hours worked: $%d - int\n", hoursWorkedOvertime);
	}

	//Perform some calculations for percentages and monthly rates
	//Then, output all of the values and display things such as gross and net pay
	public static void outputStatistics(){
		monthlyPay = hoursWorkedRegular*rateRegular + hoursWorkedOvertime*rateOvertime;
		monthlyElectric = (electricPayPercent*.01) * monthlyPay;
		monthlyWater = (waterPayPercent*.01) * monthlyPay;
		monthlySewer = (sewerPayPercent*.01) * monthlyPay;
		monthlyGas = (gasPayPercent*.01) * monthlyPay;
		foodPayPercent = foodBudget/monthlyPay;
		entertainPayPercent = entertainBudget/monthlyPay;
		carPayPercent = carExpenses/monthlyPay;
		monthlyExpenses = monthlyElectric + monthlyWater + monthlySewer + monthlyGas + foodBudget + entertainBudget + carExpenses;
		monthlyNetPay = monthlyPay - monthlyExpenses;

		System.out.printf("\nElectricity: $%.2f (%.2f%%)\n", monthlyElectric, electricPayPercent);
		System.out.printf("Water: $%.2f (%.2f%%)\n", monthlyWater, waterPayPercent);
		System.out.printf("Sewage: $%.2f (%.2f%%)\n", monthlySewer, sewerPayPercent);
		System.out.printf("Gas: $%.2f (%.2f%%)\n", monthlyGas, gasPayPercent);
		System.out.printf("Food: $%.2f (%.2f%%)\n", foodBudget, foodPayPercent);
		System.out.printf("Entertainment: $%.2f (%.2f%%)\n", entertainBudget, entertainPayPercent);
		System.out.printf("Car: $%.2f (%.2f%%)\n", carExpenses, carPayPercent);
		System.out.printf("Total Expenses/Deducations: $%.2f\n", monthlyExpenses);
		System.out.printf("Gross pay: $%.2f\n", monthlyPay);
		System.out.printf("Net pay: $%.2f\n", monthlyNetPay);

	}

	public static void main(String[] args){
		String name = promptUserName(); //Call the promptUserName method to store the user's name
		promptVariables(); //Ask the user for all of the variables amounts

		System.out.printf("\nHello %s!  This program will create a budget calculator for you.\n", name);

		outputVariables(); //Print out all of the variable values
		outputStatistics(); //Print out all of the budget statistics
	}
}
