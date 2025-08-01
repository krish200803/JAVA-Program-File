package STRINGS;

import java.util.Arrays;

public class Strings_Methods {

	public static void main(String[] args) {
		
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.println(s.charAt(0));           //  p
		System.out.println(s.codePointAt(9));       //  108
		System.out.println(s.codePointBefore(9));     //  117
		System.out.println(s.codePointCount(0, 12));   //  12
		
		System.out.println(s.length());    //  45
		
//		-----------------------------------------------------------------------------------
		
		System.out.println("Vinay".compareTo("Vijay"));    // o/p =>  4
//		'V' is compared with 'V', and they are the same.
//		'i' is compared with 'i', and they are also the same.
//		'n' (Unicode 110) is then compared with 'j' (Unicode 106).
//		Since 'n' is greater than 'j', the method returns a positive integer representing the 
//		difference between their Unicode values, which is 110 - 106 = 4. 
		
		System.out.println("Vinay".compareTo("vijay"));    // o/p => -32
//		The first characters, 'V' and 'v', are compared. Since 'V' (Unicode 86) comes before 'v' (Unicode 118) 
//		in the Unicode sequence, the comparison stops at this point.
//		In this case, 86 - 118 = -32.
		
		System.out.println("Vinay".compareToIgnoreCase("vijay")); // o/p => 4
		
//		-------------------------------------------------------------------------------------
		
		System.out.println("Umesh".concat("Bhadane"));   // UmeshBhadane

		System.out.println(s.contains("volcano"));    // true
		
		System.out.println("hii".contentEquals("hii"));   // true
		
//		---------------------------------------------------------------------------------------
		
		System.out.println(s.endsWith("sis"));      //   true
		System.out.println(s.startsWith("sis"));   // false
		System.out.println(s.startsWith("vol", 30));  // true
		
//		---------------------------------------------------------------------------------------
		
		System.out.println(Arrays.toString(s.getBytes())); // [112, 110, 101, 117, 109, 111, 110, 111, 117, 108, 116, 114, 97, 109, 105, 99, 114, 111, 115, 99, 111, 112, 105, 99, 115, 105, 108, 105, 99, 111, 118, 111, 108, 99, 97, 110, 111, 99, 111, 110, 105, 111, 115, 105, 115]
		
		byte[] ar = s.getBytes();
		System.out.println(Arrays.toString(ar));   //  [112, 110, 101, 117, 109, 111, 110, 111, 117, 108, 116, 114, 97, 109, 105, 99, 114, 111, 115, 99, 111, 112, 105, 99, 115, 105, 108, 105, 99, 111, 118, 111, 108, 99, 97, 110, 111, 99, 111, 110, 105, 111, 115, 105, 115]
		
//		--------------------------------------------------------------------------------------
		
		System.out.println(s.indent(10));
		System.out.println("Umesh".indent(5));   //  _____Umesh
		
//		-------------------------------------------------------------------------------------
		
		System.out.println(s.indexOf('e'));   // 2
		System.out.println(s.indexOf("volcant"));     // 30      //  -1
		System.out.println(s.indexOf('o', 9));       // 17
		System.out.println(s.indexOf("micro", 5));    //  13
		
//		--------------------------------------------------------------------------------------
		// counting from last
		
		System.out.println(s.lastIndexOf('o'));      //  42
		System.out.println(s.lastIndexOf("volcano"));     // 30
		System.out.println(s.lastIndexOf('o', 50));    //  41
		System.out.println(s.lastIndexOf("silico", 38));    //  24
		
//		-----------------------------------------------------------------------------------------
		
		System.out.println("     ".isBlank());    //  true
		System.out.println("    ".isEmpty());   // false
		
//		--------------------------------------------------------------------------------------
		
		System.out.println("ABC".repeat(5));  //  ABCABCABCABCABC
		
//		--------------------------------------------------------------------------------------
		
		System.out.println(s.replace('a', '@'));   //  pneumonoultr@microscopicsilicovolc@noconiosis
		
		System.out.println(s.replace("volcano", "Tsunami"));   //  pneumonoultramicroscopicsilicoTsunamiconiosis
		
//		------------------------------------------------------------------------------------------------------
		
		String s2 = "I Love India";
		
		String [] words = s2.split("o");   //   [I L, ve India]
		String [] words1 = s2.split(" ");   //   [I, Love, India]
		String [] words2 = s2.split("");    //   [I,  , L, o, v, e,  , I, n, d, i, a]
		
		System.out.println(Arrays.toString(words));  
		
//		-------------------------------------------------------------------------------------------------
		
		System.out.println("    ABC  ".strip());           // ABC
		System.out.println("    ABC   ".stripIndent());    //  ABC
		System.out.println("    ABC    ".stripLeading());    //  ABC_____    
		System.out.println("    ABC    ".stripTrailing());   //  ____ABC
		
//		--------------------------------------------------------------------------------------------------
		
		System.out.println(s.substring(13));    //  microscopicsilicovolcanoconiosis
		System.out.println(s.substring(13, 18));    //   micro
		
//		----------------------------------------------------------------------------------------------------
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));  //  [p, n, e, u, m, o, n, o, u, l, t, r, a, m, i, c, r, o, s, c, o, p, i, c, s, i, l, i, c, o, v, o, l, c, a, n, o, c, o, n, i, o, s, i, s]
		
//		-----------------------------------------------------------------------------------------------------
		
		System.out.println(s.toUpperCase());   //  PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS
		
		System.out.println(s.toLowerCase());   //  pneumonoultramicroscopicsilicovolcanoconiosis
	}

}
