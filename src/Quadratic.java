import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Welcome To Quadratic Program");
		System.out.println("Quadratic equation format a*x*x + b*x + c");
		System.out.println("a, b and c are constants");
		Scanner scanner = new Scanner(System.in);
		// INPUT three numbers a, b and c
		double a = 0;
		System.out.print("Enter a number : ");
		a = scanner.nextDouble();
		double b = 0;
		System.out.print("Enter b number : ");
		b = scanner.nextDouble();
		double c = 0;
		System.out.print("Enter c number : ");
		c = scanner.nextDouble();

		// Show Quadratic Equation
		System.out.println("You entered a, b and c values are "+a+", "+b+" and "+c+" respectively");
		System.out.println("And you entered quadratic equation is "+a+"*x*x + "+b+"*x + "+c);
		// Calculation
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Their are no real roots");
		} else {
			double root1X = (-b + Math.sqrt(delta)) / (2 * a);
			double root2X = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root 1 of X is : "+root1X);
			System.out.println("Root 2 of X is : "+root2X);
		}
		scanner.close();
	}

}