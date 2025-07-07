package WrapperClass.Boxing;

public class Boxing3 {

	public static void main(String[] args) {
		
		Byte b1 = new Byte((byte) 100);
		Integer b2 = new Integer(100);
		
		System.out.println(b1.equals(b2));  // not possible as they are of Different Type Object
		
		
//		If we want to Compare two Wrapper Object it should be of same type ,
//		If we compare then the output will be false means it is not possible we should not do it
		

	}

}
