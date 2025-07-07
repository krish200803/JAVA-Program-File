package WrapperClass.Boxing;

public class Boxing1 {

	public static void main(String[] args) {
		
		int a = 10;        // Primitive data
		
		Integer i = new Integer(a);
		System.out.println(i);           // 10    // converted to non-primitive type
		
		Double d = new Double(10.3124);
		System.out.println(d);                  // 10.3124
		
		Character ch = new Character('a');
		System.out.println(ch);                 // a
		
		Boolean b1 = new Boolean(false);
		System.out.println(b1);                 // false
		
		Long l = new Long(123453423134l);
		System.out.println(l);                  // 123453423134
		
		Float f = new Float(1.1231f);
		System.out.println(f);                  // 1.1231
		
		byte b = 120;
		Byte b2 = new Byte(b); 
		Byte b3 = new Byte((byte) 130);         // range 1 - 127 therefore we need to typecast Byte only
		System.out.println(b2);              // 120
		System.out.println(b3);              // -126
		
		
//		The Process of Converting the primitive dtata to the Non-Primitive type is called Boxing.
		
//		In JDK Boxing and Unboxing were deprecated in JDK 9 due to JAVA supports autoboxing and autounboxing feature
//		from JDK 5 due to purposefully used his they deprecated Boxing and Unboxing from JDK 9.
		
//		In Wrapper classes the toString(), hashcode(), equals() methods are internally overrided that prints attributes
//		rather than the Reference.
		
//		All the wrapper classes are made final therefore we cant internally overrided them therefore the Wrapper classes
//		are are internally overrided by toString(), hashcode(), equals() methods.
		
		

	}

}
