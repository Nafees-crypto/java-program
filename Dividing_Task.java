package DailyTasks;

public class Dividing_Task {

	public static void main(String[] args) {

		System.out.println("Number 50 - 100:");

		for (int i = 100; i >= 50; i--) {
			if (i % 4 == 0 && i % 2 == 0) {
				System.out.println(i+"Divisible by both Numbers");
			} else if (i % 4 == 0) {
				System.out.println(i+"Divisible by 4");
			} else if (i % 2 == 0) {
				System.out.println(i+"Divisible by 2");
			}
		}
	}

}
