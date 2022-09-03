
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		System.out.println("Wecome to Distance Program");
		Scanner scanner = new Scanner(System.in);
		// INPUT two numbers X and Y
		double x = 0;
		System.out.print("Enter X number : ");
		x = scanner.nextDouble();
		double y = 0;
		System.out.print("Enter Y number : ");
		y = scanner.nextDouble();
		System.out.println("You entered X and Y numbers are "+x+", "+y+" respectively. ");

		// Calculate Distance
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance is "+distance);
		scanner.close();
	}

}