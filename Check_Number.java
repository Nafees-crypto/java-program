package DailyTasks;

import java.util.Scanner;

public class Check_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();

		if (number > 0) {
			System.out.println("The number is positive.");
		}

		if (number < 0) {
			System.out.println("The number is negative.");
		}

		if (number == 0) {
			System.out.println("The number is zero.");
		}

		scanner.close();
	}
}
