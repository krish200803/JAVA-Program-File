package HasARelationship.Composotion;

public class Battery 
{
	private String brand;
	private String type;
	private int power;
	private String manufacturingDate;
	private double warrenty;
	
	// Getters
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public double getPower() {
		return power;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public double getWarrenty() {
		return warrenty;
	}
	public Battery(String brand, String type, int power, String manufacturingDate, double warrenty) {
		super();
		this.brand = brand;
		this.type = type;
		this.power = power;
		this.manufacturingDate = manufacturingDate;
		this.warrenty = warrenty;
		
		System.out.println("Battery installed!");
	}
	
	public void displayBattery() {
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Power : "+power+"W");
		System.out.println("Warrenty : "+warrenty+" years");
		System.out.println("Manufacturing Date : "+manufacturingDate);
		System.out.println("=============================");
	}
	
}