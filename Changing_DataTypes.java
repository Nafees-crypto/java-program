package DailyTasks;

import java.util.Scanner;

public class Changing_DataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number as String:");
		String input = scan.nextLine();

		int intobj = Integer.parseInt(input);
		System.out.println("Int:" + intobj);

		long longobj = Long.parseLong(input);
		System.out.println("Long:" + longobj);

		float floatobj = Float.parseFloat(input);
		System.out.println("Float:" + floatobj);

		double doubleobj = Double.parseDouble(input);
		System.out.println("Double:" + doubleobj);

		scan.close();

	}
}
