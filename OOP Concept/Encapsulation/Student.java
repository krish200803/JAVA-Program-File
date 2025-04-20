package principlesOfOops;

public class Student {
	
	private String institute = "Qspider";
	private String name ;
	private String course;
	private double fees;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phno;
	
	public Student(String name, String course, double fees, String branch, double cgpa, String degree, double sscPer, 
			double hscPer, long phno )
	{
		this.name = name;
		this.course = course;
		this.fees = fees;
		this.branch = branch;
		this.cgpa = cgpa;
		this.degree =degree;
		this.sscPer = sscPer;
		this.hscPer = hscPer;
		this.phno = phno;
		
		
		System.out.println(name +" is Registered");
	}
	
	
	//   Getters
	
	public String getinstitute() {
		return institute;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getcourse()
	{
		return course;
	}
	
	public double getfees() 
	{
		return fees;
	}
	
	public String getbranch()
	{
		return branch;
	}
	
	public double getcgpa() {
		return cgpa;
	}
	
	public String getdegree() {
		return degree;
	}
	
	public double getsscPer() {
		return sscPer;
	}
	public double gethscPer() {
		return hscPer;
	}
	
	public long getphno() {
		return phno;
	}
	
	// Setters
	
	public void setbranch(boolean permission, String branch) {
		if(permission)
		{
			this.branch = branch;	
			System.out.println("Branch changed to "+ branch +" Successfully");
		}
		else {
			System.out.println("Permission Denied");
		}
	}
	
	
	public void setphno(boolean id, long phno) {
		if(id) {
			this.phno = phno;
			System.out.println("Phno Changed Successfully");
			
		}
		else {
			System.out.println("Enter valid ID");
		}
	}
	
	
}
