package DailyTasks;

import java.util.Scanner;

public class PrimeNum_Else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (number <= 1) {
			System.out.println(number + " is not a prime number.");
		} else {
			boolean isPrime = true;

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;

				}
			}

			if (isPrime) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is not a prime number.");
			}
		}

		scanner.close();
	}
}
