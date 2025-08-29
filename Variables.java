package Practice;

public class Variables {

	int age = 5; // instance
	static int svar = 40; // static varaible

	public void myMethod() {
		int localvar = 4; // local variable
		System.out.println(localvar);
	}

	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.myMethod();
		System.out.println(svar);
		System.out.println(obj.age);
		int year = 2025; // loacal var can be declared inside the main
		System.out.println(year);
	}
}
