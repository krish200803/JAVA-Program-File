package WrapperClass.Unboxing;

public class Unwrap1 {

	public static void main(String[] args) {
		
		Integer i = new Integer(100);                  // Box       // non- primitive data
		int ans = i.intValue();
		System.out.println(ans);          // 100       // Unbox     // Primitive type
		
		Boolean b = new Boolean(false);
		boolean val = b.booleanValue();
		System.out.println(val);         // false
		
		Character c = new Character('a');
		char ch = c.charValue();
		System.out.println(ch);          // a
		
		Double d = new Double(1.12345);
		double d1 = d.doubleValue();
		System.out.println(d1);          // 1.12345
		
		Byte by = new Byte((byte) 120);
		byte by1 = by.byteValue();
		System.out.println(by1);         // 120
		
		
//		The process of converting Non-primitive data into its respective Primitive type is called as Unboxing
		
	}

}
