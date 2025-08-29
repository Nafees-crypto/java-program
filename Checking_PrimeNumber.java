package DailyTasks;

import java.util.Scanner;

public class Checking_PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		boolean isPrime = true;
		int i = 2;

		if (number <= 1) {
			isPrime = false;
		}

		while (i < number) {
			if (number % i == 0) {
				isPrime = false;
			}
			i++;}

		if (isPrime) {System.out.println(number + " is a prime number.");}

		if (!isPrime) {System.out.println(number + " is not a prime number.");}

		scanner.close();
	}
}
