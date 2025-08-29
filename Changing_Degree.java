package DailyTasks;

import java.util.Scanner;

public class Changing_Degree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Celsius:");
		double celsius = scan.nextDouble();

		System.out.println("Enter Fahrenheat:");
		double fahrenheit = scan.nextDouble();

		System.out.println("Enter Kelvin:");
		double kelvin = scan.nextDouble();

		System.out.println("Celsius:");
		System.out.println("Celsius to Fahrenheit: " + (9 / 5 * celsius) + 32);
		System.out.println("Celsius to Kelvin: " + (celsius + 273.15));

		System.out.println();

		System.out.println("Fahrenheit:");
		System.out.println("Fahrenheit to Celsius: " + (fahrenheit - 32) * 5 / 9);
		System.out.println("Fahrenheit to Kelvin: " + (fahrenheit - 32) * 5 / 9 + 273.15);

		System.out.println();

		System.out.println("Kelvin:");
		System.out.println("Kelvin to Celsius: " + (kelvin - 273.15));
		System.out.println("Kelvin to Fahrenheit: " + (kelvin - 273.15) * 9 / 5 + 32);

		scan.close();

	}

}
