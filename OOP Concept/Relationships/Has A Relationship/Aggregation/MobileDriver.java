package HasARelationship.Aggregation;

public class MobileDriver {

	public static void main(String[] args) {
		
		Mobile m1  = new Mobile("Samsung", "A12", "5G", 20000.0);
		m1.displayMobile();
		
		m1.insertSim("Airtel", "5G", "Prepaid", 7894561230l);
		m1.s.displaySim();
		
		m1.insertCharger("Samsung", "45 Watt", "Type C", 150.0);
		m1.c.displayCharger();

	}

}
