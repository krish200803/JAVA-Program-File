package HasARelationship.CombiningBothAggregationAndComposotion;

public class SimCard 
{
	private String serviceProvider;
	private String networkType;
	private String type;
	private long number;
	
	public String getServiceProvider() {
		return serviceProvider;
	}
	
	public SimCard(String serviceProvider, String networkType, String type, long number) {
		super();
		this.serviceProvider = serviceProvider;
		this.networkType = networkType;
		this.type = type;
		this.number = number;
		
	}
	
	public void displaySimCard() {
		System.out.println("------------- Details of SimCard -------------");
		System.out.println("Sim card ServiceProvider : "+serviceProvider);
		System.out.println("Sim card Network Type : "+networkType);
		System.out.println("Sim card Type : "+type);
		System.out.println("Sim card Number : "+number);
		System.out.println("================================================");
	}
	
}

