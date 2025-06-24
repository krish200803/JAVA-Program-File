package Interface;

public class FatherMotherDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f = new Son();
		
		System.out.println(f.marks);
		
		f.degree();
		Father.msg();
		
		System.out.println("------------- Mother --------------");
		
		Mother m = new Son();
		
		System.out.println(m.marks);
		m.degree();
		Mother.msg();


	}

}
