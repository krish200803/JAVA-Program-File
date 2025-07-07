package WrapperClass.AutoBoxingAutoUnBoxing;

public class AutoBoxingAutoUnBoxing {

	public static void main(String[] args) {
		
	Integer i = 10;                    // Auto-Boxing
	System.out.println(i);   // 10  ( in Object i.e non-primitive)
	
	int a = i;                         // Auto-UnBoxing
	System.out.println(a);   // 10  ( primitive )
	
	Character c = 'a';                 // Auto-Boxing
	System.out.println(c);   // a   ( in Object i.e non-primitive)
	
	char ch = c;                       // Auto-UnBoxing
	System.out.println(ch);  // a   ( primitive )
		
	}

}
