package HasARelationship.CombiningBothAggregationAndComposotion;

public class AggreagationCompositonExampleDriver {

	public static void main(String[] args) 
	{
		Processor processor = new Processor("Dual core","5g",2.5, 12, 512);
		Mobile mobile= new Mobile("Samsung",  "A12",  "White",  20000, 64, processor);
	
		mobile.addHeadPhone("boat","NeckBand","15.1.1",800);
		mobile.getHeadphone().displayHeadPhone();
		mobile.addCharger("Samsung", 45, "type-c");
		mobile.getCharger().displayCharger();
		
		SimCard[] arr = mobile.getSimcards();
		mobile.addSimcard("Jio", "5G", "prepaid", 9876543210l);
		
		for(SimCard ele: arr) {
			try {
				ele.displaySimCard();
			}catch(Exception e) {
				System.out.println("One Sim space is empty");
			}
		}
		
		mobile.addSimcard("Airtel", "5G", "prepaid", 1234568790l);
		mobile.addSimcard("bsnl", "5G", "prepaid", 1234568790l);    // limit extend 
		
		mobile.getProcessor().displayProcessor();     // processor is in the Mobile
		processor.getos().displayOS();        // OS is in the Processor
		mobile.getBattery().displayBattery(); // Battery is in the Mobile
	}

}

