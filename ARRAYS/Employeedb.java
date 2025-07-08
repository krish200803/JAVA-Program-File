package ARRAYS;

public class Employeedb {

	public static void main(String[] args) {
		
		Employee[] db = new Employee [5];
		
		db[0] = new Employee(101 ,"Umesh", "Development", "JAVA", 3, "Walmart", 120000.0);
		db[1] = new Employee(102, "Mahesh", "Testing", "Python", 5, "Amazon", 200000.0);      // to Store the Dtata in the Array
		db[2] = new Employee(103, "Karan", "Web Development", "MERN Satck", 2, "Wipro", 50000.0); 
		db[3] = new Employee(104, "Manish", "Cloud Engineer", "AWS", 5, "Oracle", 2500000.0);
		db[4] = new Employee(105, "Arjun", "Frontend", "React.JS", 1, "Infosys", 500000.0);
		
		for(int i = 0; i<db.length; i++)
		{
			System.out.println(db[i]);
			
//			System.out.println(db[i].name);
			
//			System.out.println(db[i].Depart);
		}
		

	}

}
