package WrapperClass.Boxing;

public class Boxing2 {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		
		System.out.println(i1);       // 10
		System.out.println(i2);       // 10
		
		System.out.println(i1 == i2);           // false   ( Compare original Reference )
		
		System.out.println(i1.equals(i2));      // true    ( Compare Overrided Refernce )
		
		System.out.println(i1.hashCode());      // 10
		System.out.println(i2.hashCode());      // 10
		
		System.out.println(i1.toString());      // 10
		System.out.println(i2.toString());      // 10
		
		
//		In Wrapper classes the toString(), hashcode(), equals() methods are internally overrided that prints attributes
//		rather than the Reference.
		
//		All the wrapper classes are made final therefore we cant internally overrided them therefore the Wrapper classes
//		are are internally overrided by toString(), hashcode(), equals() methods.

	}

}
