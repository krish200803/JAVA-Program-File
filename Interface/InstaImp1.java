package Interface;

public abstract class InstaImp1 implements Instagram{
	
	String user;
	String pass;
	
	public InstaImp1() {
		// TODO Auto-generated constructor stub
	}
	
	public InstaImp1(String user, String pass)
	{
		super();
		this.user = user;
		this.pass = pass;
		
		System.out.println("Account Created !!!");
	}
	
	public void post(String ip)
	{
		System.out.println(ip);
		System.out.println(user+" Posted");
	}
	
	public void like(String name)
	{
		System.out.println(name+" Liked !!!");
	}
	
	public void comment(String name, String ip)
	{
		System.out.println(ip);
		System.out.println(name+" Commented !!!");
	}
	
	public void message(String name, String msg)
	{
		System.out.println(msg);
		System.out.println("Message sent to "+ name);
	}



}
