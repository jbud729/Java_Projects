import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		startGuessingGame();
	}
	
	public static void startGuessingGame() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in); 
		
		int randomNumber = random.nextInt(0, 50), counter = 0;
		//System.out.println(randomNumber);
		
		while(counter < 5) {
			
			System.out.println("Guess the right number between 0 and 50!");
			int answer = scanner.nextInt(); 
			
			if(answer < randomNumber) {
				System.out.print("Lower than correct number! ");
			}
			else if (answer > randomNumber) {
				System.out.print("Higher than correct number! ");
			}
			else {
				System.out.println("You are correct!");
				restartQuit();
				return;
			}
			
			counter++;
			System.out.println((5 - counter)+ " more attempt(s).");
		}
		
		System.out.println("You LOSE!");
		restartQuit();
	}
	
	public static void restartQuit() {
		String response;
		Scanner s = new Scanner(System.in); 
		System.out.println("Would you like to play again? Press r for restart or q for quit");
		response = s.nextLine();
		if (response.equals("r")) {
			startGuessingGame();
		}
		else if (response.equals("q")) {
			System.out.println("Thanks for playing!");
		}
		else {
			System.out.println("Invalid input, try again.");
			restartQuit();
		}
	}
	
}
