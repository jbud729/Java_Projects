import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
	
		sum();
	}

	public static void sum() {
		Scanner answer = new Scanner(System.in);
		System.out.println("What is your first nummber?");
		int a = answer.nextInt();
		System.out.println("What is your second nummber?");
		int b = answer.nextInt();
		answer.close();
		int addedNumbers = a+b;
		System.out.println("Your answer is "+addedNumbers+"!");
		
	}
}
