package HasARelationship.Composotion;

public class MobileDriver 
{
	public static void main(String[] args)
	{
		OperatingSystem os = new OperatingSystem("Android 13","One UI",128,"20/08/2021");
		Mobile mobile = new Mobile( "Samsung",  "A12",  "White",  20000, 64, os);
		mobile.displayMobile();
		mobile.getOS().displayOS()	;
		mobile.getBattery().displayBattery();
		
	}
}
