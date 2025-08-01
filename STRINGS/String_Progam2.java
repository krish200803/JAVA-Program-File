package STRINGS; 

public class String_Progam2 {

	public static void main(String[] args) {
		
		
		String s1 = "Hii";
		
		String s2 = "Hello";
		
		String s3 = "Hii";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s3);    // True
		
		System.out.println(s1.equals(s3));   // True
		
		System.out.println(s1.hashCode());   // 72552
		System.out.println(s2.hashCode());   // 69609650
		System.out.println(s3.hashCode());   // 72552
		
		System.out.println(s1.hashCode()==s3.hashCode());    // True
		
		

	}

}
