/*
Header
*/

import java.util.*;

public class Example{

	public static String promptUserName(){
		Scanner sc = new Scanner(System.in); //Takes in the input

		System.out.print("Enter your name: ");
		String name = sc.next();

		return name;
	}

	public static double getHourlyRate(){
		Scanner sc = new Scanner(System.in); //Takes in the input

		System.out.print("Enter your hourly wage: ");
		double wage = Double.parseDouble(sc.next());

		//This is another way to take in the input, but I prefer the above
		//double wage = sc.nextDouble();

		return wage;
	}

	public static int getHoursWorked(){
		Scanner sc = new Scanner(System.in); //Takes in the input

		System.out.print("Enter your regular hours worked: ");
		int hours = Integer.parseInt(sc.next());

		//This is another way to take in the input
		//int hours = sc.nextInt();

		return hours;
	}

	public static void main(String[] args){
		String name = promptUserName();
		int regularHoursWorked = getHoursWorked();
		double regularHourlyRate = getHourlyRate();

		System.out.println("Welcome " + name + "!");
		System.out.printf("Welcome %s! You have worked %d hours at a rate of $%.2f per hour.", name, regularHoursWorked, regularHourlyRate);
	}

}
