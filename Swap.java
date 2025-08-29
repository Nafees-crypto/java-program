package Practice;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Enter the value of X & Y");
		Scanner scan = new Scanner(System.in);
		 int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("The value before swapping is" + x + "," + y);
		x = x + y;
		y = x - y;
		x = x - y;
//		temp=x;
//		x=y;
//		y=temp;
		System.out.println("the value after swapping id " + x + "," + y);
	}
}
