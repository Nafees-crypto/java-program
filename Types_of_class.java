package Practice;

public class Types_of_class {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.5F;
		double d = 60.0D;
		char c = 'a';
		boolean b1 = true;

//Autoboxing:converting primitive datatype into objects
		// creating obj for particular var.
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean booobj = b1;

		// printing objects
		System.out.println("printing object values");

		System.out.println(byteobj);
		System.out.println(shortobj);
		System.out.println(intobj);
		System.out.println(longobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(charobj);
		System.out.println(booobj);

	}
}
