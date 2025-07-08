package ARRAYS;

public class Employee {
	int id;
	String name;
	String Depart;
	String tech;
	int Exp;
	String comp;
	double sal;
	
	
	public Employee() {
		super();
	}

	
	public Employee(int id, String name, String depart, String tech, int exp, String comp, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.Depart = depart;
		this.tech = tech;
		this.Exp = exp;
		this.comp = comp;
		this.sal = sal;
	}
	
	// Here toString() Method has Overrided due to we want to print the Attributes instead of Reference
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + name + ", Department=" + Depart + ", technology=" + tech + ", Exp=" + Exp
				+ ", company=" + comp + ", salary=" + sal + "]";
	}
	
	

}
