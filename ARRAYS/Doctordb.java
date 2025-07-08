package ARRAYS;

public class Doctordb {

	public static void main(String[] args) {
	
		Doctor [] db = new Doctor[5];
		
		db[0] = new Doctor("Umesh", 500.0, "MBBS", 5, "Poona Hospital");
		db[1] = new Doctor("Om", 700.0, "MBBS", 7, "Tata Hospital");
		db[2] = new Doctor("Arjun", 500.0, "MBBS", 10, "Apolo Hospital");      // to Store the Dtata in the Array
		db[3] = new Doctor("Manish", 1000.0, "MBBS", 3, "AIMMS Hospital");
		db[4] = new Doctor("Karan", 200.0, "BHMS", 6, "Sayadhri Hospital");
		
		for(int i = 0; i<db.length; i++)
		{
			System.out.println(db[i]);
		}

	}

}
