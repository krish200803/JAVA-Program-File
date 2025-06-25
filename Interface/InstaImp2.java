package Interface;

public class InstaImp2 extends InstaImp1 {
	
	public InstaImp2() {
		// TODO Auto-generated constructor stub
	}
	
	public InstaImp2(String user, String pass)
	{
		super(user, pass);
	}
	
	public void story(String msg)
	{
		System.out.println(msg);
		System.out.println("Story Updated!!!");
	}

}
