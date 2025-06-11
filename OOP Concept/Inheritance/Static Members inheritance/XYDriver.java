package Inheritance.staticMembers;

public class XYDriver {

	public static void main(String[] args) {
		
		Y y1 = new Y();
		
		y1.main(null);    // From Main Method of X
		
		y1.test();        // 100
		
		y1.displayY();    // From Display Y method
		
	}

}
