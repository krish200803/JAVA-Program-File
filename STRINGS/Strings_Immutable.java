
//		Why strings are immutable?
//->    Because,Once the State of the Object is created it can never be modify.  Whenn We try to modify a String Object a new 
//		a new Object is Created and its reference is restored.

package STRINGS;

public class Strings_Immutable {

	public static void main(String[] args) {
		
		String s1 = "Umesh";
		System.out.println(s1.hashCode());        //  81847234
		System.out.println(s1);
		
		System.out.println("Umesh".hashCode());   //  81847234
// 		Hashcode is same of that of String s1. By this we can say that the ref of Objet s1 is assign to "Umesh". 
//		when we create the same Object instrad of Creating the new Object inside the "String Constant Pool Area".
		
		String s2 = s1 + "Umesh".hashCode();
		System.out.println(s2.hashCode());       //  Umesh81847234  Same hashcode of "Umesh"
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		String s3 = s2 +"Umesh";
		System.out.println(s3);
		System.out.println(s3.hashCode());       //  Umesh81847234Umesh
		System.out.println(s2==s3);
		
		
//		---------------------------Proof that the Object reference/Passed Is Same-----------------------------------
		
		int a = s1.hashCode() + "Umesh".hashCode();  // 81847234 + 81847234 = 163694468
		System.out.println(a);                       //  163694468 

	}

}
