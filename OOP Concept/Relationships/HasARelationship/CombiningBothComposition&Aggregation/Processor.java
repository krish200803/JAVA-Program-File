package HasARelationship.CombiningBothAggregationAndComposotion;

public class Processor {
	private String type;
	private String networkType;
	private double clockSpeed;
	private int ram;
	private int rom;
	private OperatingSystem os;
	
	public Processor(String type, String networkType, double clockSpeed, int ram, int rom) {
		super();
		this.type = type;
		this.networkType = networkType;
		this.clockSpeed = clockSpeed;
		this.ram = ram;
		this.rom = rom;
		this.os = new OperatingSystem("Android 13","Xiaomi HyperOS",128,"26/10/2023");
		System.out.println("Processor is ready with OS installed inbuilt");
	}
	
	public void displayProcessor() {
		System.out.println("----------- Details of Processor -----------");
		System.out.println("Processor Type : "+type);
		System.out.println("Processor ClockSpeed : "+clockSpeed);
		System.out.println("Processor Network Type : "+networkType);
		System.out.println("Processor RAM : "+ram);
		System.out.println("Processor ROM : "+rom);
		System.out.println("============================================");
	}
	
	public OperatingSystem getos() {
		return os;
	}
}

