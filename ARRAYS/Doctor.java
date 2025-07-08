package ARRAYS;

public class Doctor {
	
	String name;
	double fees;
	String degree;
	int exp;
	String hospital;
	
	public Doctor() {
	}
	
	public Doctor(String name, double fees, String degree, int exp, String hospital)
	{
		super();
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
	}
	
	// Here toString() Method has Overrided due to we want to print the Attributes instead of Reference
	
	public String toString()
	{
		return "[" + " Name :"+ name +" Fees :"+ fees+ " Degree :"+ degree + " Exp :"+ exp + " Hospital :"+ hospital+ "]";
	}

}
