package DailyTasks;

public class PrintingNum_UsingIf {

	public static void main(String[] args) {
		printNumber(1);
	}

	static void printNumber(int num) {
		if (num <= 10) {
			System.out.println(num);
			printNumber(num + 1); 
		}
	}
}
