import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Side a?");
		double a = scanner.nextDouble();
		
		System.out.println("Side b?");
		double b = scanner.nextDouble();
		
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		
		System.out.println("Hypotenuse is "+c);
		
		scanner.close();
		
	}

}
