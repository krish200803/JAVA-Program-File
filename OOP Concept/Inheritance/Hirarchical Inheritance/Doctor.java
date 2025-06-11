package Inheritance.Hirarchical;

public class Doctor {

	String name;
	double fees;
	String degree;
	int exp;
	String hospital;
	
	public Doctor(String name,double fees, String degree, int exp, String hospital)
	{
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
	}
	
	public void displayDoctor()
	{
		System.out.println("Name :"+ name);
		System.out.println("Fees :"+ fees);
		System.out.println("Degree :"+ degree);
		System.out.println("Experience :"+ exp);
		System.out.println("Hospital :"+ hospital);
	}
}
