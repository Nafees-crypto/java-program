package DailyTasks;

import java.util.Scanner;

public class Check_leapyear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println(year + " is a leap year.");
		}

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		}

		if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
			System.out.println(year + " is not a leap year.");
		}

		scanner.close();
	}
}
