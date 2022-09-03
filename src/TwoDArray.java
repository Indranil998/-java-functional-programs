import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Welcome to 2 D Array Program");
		Scanner scanner = new Scanner(System.in);
		// INPUT number of rows M
		int M = 0;
		System.out.print("Enter number of rows : ");
		M = scanner.nextInt();
		// INPUT number of columns N
		int N = 0;
		System.out.print("Enter number of columns : ");
		N = scanner.nextInt();
		System.out.println("You have to enter "+M+" * "+N+" matrix");
		// 2 Dimentional Array Creation
		int[][] array = new int[M][N];
		// Read Values for array
		System.out.println("Enter values to array");
		for (int m = 0; m < M; m++) {
			for (int n = 0; n < N; n++) {
				System.out.print("Enter value for "+m+" * "+n+" : ");
				array[m][n] = scanner.nextInt();
			}
		}
		// Show Values in Array
		for (int m = 0; m < M; m++) {
			for (int n = 0; n < N; n++) {
				System.out.print(array[m][n]+"\t");
			}
			System.out.println("");
		}
		scanner.close();
	}

}