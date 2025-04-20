package HasARelationship.Aggregation;

public class Sim {
	String serviceProvider;
	String networkType;
	String type;
	long simNo;
	
	public Sim() {};
	
	public Sim(String serviceProvider, String networkType, String type, long simNo )
	{
		super();
		this.serviceProvider =  serviceProvider;
		this.networkType = networkType;
		this.type = type;
		this.simNo = simNo;
	}
	
	public void displaySim()
	{
		System.out.println("----------- Details of Sim --------------");
		System.out.println("Service Provider : "+ serviceProvider );
		System.out.println("Network Type : "+ networkType );
		System.out.println("Type : "+ type );
		System.out.println("Sim No : "+ simNo );
		System.out.println("*****************************************");
	}
}
