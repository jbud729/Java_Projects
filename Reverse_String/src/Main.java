import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		startGame(true);
	}
	

	public static void startGame(boolean playGame) {
		while(playGame == true) {
			String response = null;
			Scanner scanner = new Scanner(System.in);
			String reversedWord = "";
			System.out.println("Enter you word:");
			response = scanner.nextLine();
			for(int i = (response.length() - 1); i>=0; i--) {
				reversedWord +=response.charAt(i);
			}
			
			System.out.println("You're reversed word is: "+reversedWord);
			System.out.println("Type any key to play again or type \"exit\" to quit game" );
			response = scanner.nextLine();
			System.out.println(response);
			if (response.equals("exit")){
				playGame = false;
				System.out.println("Thanks for playing!");
			}
			
			}

	     }
	

	
	
	
}
		
	
	
	
