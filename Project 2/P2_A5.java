import java.util.*;

public class P2_A5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random dice = new Random();

		System.out.print("Enter your name: ");
		String name = sc.next();

		String playAgain = "";
		int wins = 0;
		int bigStartWins = 0;
		int rounds = 0;

		System.out.printf("Hello %s!\n", name);
		System.out.println("My name is James. You are about to play the most exhilerating dice game of your life.  Welcome to Rockymon!");
		System.out.println("The aim of the game is to roll two die to either get a 5 or a 10!");

		System.out.print("Enter a 1 to play the game manually or a 2 to have the computer play: ");
		String playType = sc.next();

		if(playType.toLowerCase().equals("1")){
			do{
				rounds++;

				int roll1 = dice.nextInt(6) + 1;
				int roll2 = dice.nextInt(6) + 1;
				int bigStart = roll1 + roll2;
				int matchNumber = 0;

				System.out.println("\nRoll 1: " + roll1);
				System.out.println("Roll 2: " + roll2);
				System.out.println("Big Start Roll: " + bigStart);

				if(bigStart == 5 || bigStart == 10){
					System.out.println("\nYou won!");
					bigStartWins++;
					wins++;
				} else if(bigStart == 2 || bigStart == 4 || bigStart == 11){
					System.out.println("\nYou lost.");
				} else{
					matchNumber = bigStart;

					do{
						roll1 = dice.nextInt(6) + 1;
						roll2 = dice.nextInt(6) + 1;
						bigStart = roll1 + roll2;
						System.out.printf("\nRoll 1: %d\nRoll 2: %d\nTotal roll: %d\n", roll1, roll2, bigStart);
					} while(bigStart != matchNumber && bigStart != 5);

					if(bigStart == matchNumber){
						System.out.println("\nYou won!");
						wins++;
					} else if(bigStart == 5){
						System.out.println("\nYou lost.");
					}
				}

				System.out.println("\nWins: " + wins);
				System.out.println("Big Start wins: " + bigStartWins);
				System.out.println("Losses: " + (rounds-wins));

				System.out.print("\nDo you want to play again? ");
				playAgain = sc.next();
			} while(playAgain.toLowerCase().equals("yes"));
		} else if(playType.toLowerCase().equals("2")){
			System.out.print("How many times do you want the computer to play? ");
			rounds = Integer.parseInt(sc.next());

			for(int i = 0; i < rounds; i++){
				int roll1 = dice.nextInt(6) + 1;
				int roll2 = dice.nextInt(6) + 1;
				int bigStart = roll1 + roll2;
				int matchNumber = 0;

				if(bigStart == 5 || bigStart == 10){
					System.out.println("\nThe computer won round " + (i+1));
					bigStartWins++;
					wins++;
				} else if(bigStart == 2 || bigStart == 4 || bigStart == 11){
					System.out.println("\nThe computer lost round " + (i+1));
				} else{
					matchNumber = bigStart;

					do{
						roll1 = dice.nextInt(6) + 1;
						roll2 = dice.nextInt(6) + 1;
						bigStart = roll1 + roll2;
					} while(bigStart != matchNumber && bigStart != 5);

					if(bigStart == matchNumber){
						System.out.println("\nThe computer won round " + (i+1));
						wins++;
					} else if(bigStart == 5){
						System.out.println("\nThe computer lost round " + (i+1));
					}
				}
			}

			System.out.println("\nWins: " + wins);
			System.out.println("Losses: " + (rounds-wins));
		}
	}
}
