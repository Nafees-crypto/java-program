package Practice;

public class Method_using_Skletonpara {
	public int subNumbers(int x, int y) {
		int sub = x - y;
		return sub;
	}

	public static void main(String[] args) {
		int num1 = 50, num2 = 30;
		Method_using_Skletonpara obj = new Method_using_Skletonpara();
		int outcome = obj.subNumbers(num1, num2);
		
		System.out.println("The result is" + outcome);
	}
}
