package ARRAYS;

public class Studentdb {

	public static void main(String[] args) {
		
		Student [] db = new Student [5];
		
		db[0] = new Student("Umesh", "SKH", 22, 101);
		db[1] = new Student("Manish", "NDMVP", 22, 102);    // to Store the Dtata in the Array
		db[2] = new Student("Arjun", "COEP", 23, 103);
		db[3] = new Student("Krish", "AIMMS", 21, 104);
		db[4] = new Student("Om", "DY Patil", 20, 105);
		
		
		for(int i=0; i<db.length; i++)
		{
			//System.out.println(db[i]);
			//System.out.println(db[i].name);
			System.out.println(db[i].id);
		}
		
		

	}

}
