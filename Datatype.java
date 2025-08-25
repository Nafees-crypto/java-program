package Practice;

public class Datatype {
	public static void main(String[] args) {

		// widing casting (automatic casting)-converting smaller type into larger type
		// size
		// byte->short->char->int->long->float->double

		// narrowing casting(manually casting)-converting larger datatype into smaller
		// type size
		// double->float->long->int->char->short->byte

		int myInt = 9;
		double myDouble = myInt;// automatic widening
		System.out.println(myInt);
		System.out.println(myDouble);

		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1;
		System.out.println(myInt1);
		System.out.println(myDouble1);
	}
}
