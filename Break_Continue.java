package Practice;

public class Break_Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5)continue;//skip
			if (i == 8)break;//stop
			System.out.println(i);
		}
	}
}
