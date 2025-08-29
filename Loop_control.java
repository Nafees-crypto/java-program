package DailyTasks;

public class Loop_control {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue;// skip
			if (i == 8)
				return;// exit method
			if (i == 9)
				break;// exit loop
			System.out.println(i);
		}

	}

}
