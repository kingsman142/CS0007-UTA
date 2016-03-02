public class Week9{
	public static void main(String[] args){
		//Use a for loop to iterate a specific amount of times (in this case, 5 times)
		//Set i equal to a value (0 in this loop)
		//Check the condition (i < 5) every time you iterate
		//Increase i by one after each iteration (i++)
		for(int i = 0; i < 5; i++){
			System.out.println("for loop: " + i);
		}
		System.out.println(); //Add some space to make the program look nicer

		int j = 0;

		//Use a do...while loop to make sure something happens at least once (for example, your game)
		do{
			System.out.println("do...while loop: " + j);
			j++; //equivalent to saying k++; or ++k;
		} while(j < 5); //Make this say "j < 0" and it will still print something out at least once
		System.out.println(); //Add some space to make the program look nicer

		int k = 0;

		//Use a while loop if you only want your loop to iterate when a condition is true (in this case, while k < 5)
		//This may loop 0 times if the condition is never met
		while(k < 5){
			System.out.println("while loop: " + k);
			k = k + 1; //equivalent to saying k++; or ++k;
		}
	}
}
