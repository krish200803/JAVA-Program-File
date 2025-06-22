package ObjectClass.HashCode;

public class Employee {
	
	String name;
	int age;
	String dept;
	String company;
	int empID;
	double sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String dept, String company, int empID, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.company = company;
		this.empID = empID;
		this.sal = sal;
	}
	
	@Override
	public String toString() {             // Customize Reference
		// TODO Auto-generated method stub
		return "EmployeeID: "+empID +" , Name: " + name +" , Age: " + age + " , dept: " + dept + " , Company: "+ company + ", Salary: "+ sal ;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj;
		
		return this.empID == e.empID;     // Here we are comparing the empID of Both the Objects .
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age + dept.hashCode() + company.hashCode() + empID;
	}

}
