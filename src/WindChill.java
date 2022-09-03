import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("Welcome To Wind Chill Program");
		Scanner scanner = new Scanner(System.in);
		// INPUT temprature t and wind speed v
		double t = 0;
		System.out.print("Enter temprature t in faranhite : ");
		t = scanner.nextDouble();
		double v = 0;
		System.out.print("Enter wind speed v in miles per hour : ");
		v = scanner.nextDouble();
		System.out.println("You entered temprature t is "+t+" and wind speed v is "+v);

		// temprature t should be less than 50 and wind speed v should be less than 120 and greater than 3
		if (t < 50 && 3 < v && v < 120) {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind Chill result is "+w);
		} else {
			System.out.println("temprature t should be less than 50 and wind speed v should be in range of 3 and 120");
		}
		scanner.close();
	}

}