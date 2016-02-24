import java.util.*;

public class Week8{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String playAgain = "";

		int roll1 = rand.nextInt(6) + 1;
		int roll2 = rand.nextInt(6) + 1;
		int total = roll1 + roll2;

		System.out.printf("Roll 1: %d\n", roll1);
		System.out.printf("Roll 2: %d\n", roll2);
		System.out.printf("Big Start Roll: %d\n", total);

		do{
			roll1 = rand.nextInt(6) + 1;
			roll2 = rand.nextInt(6) + 1;
			total = roll1 + roll2;

			System.out.printf("\nRoll 1: %d\n", roll1);
			System.out.printf("Roll 2: %d\n", roll2);
			System.out.printf("Big Start Roll: %d\n\n", total);

			System.out.print("Play again (yes or no)? ");
			playAgain = sc.next();
		} while(playAgain.equals("y"));
	}
}
