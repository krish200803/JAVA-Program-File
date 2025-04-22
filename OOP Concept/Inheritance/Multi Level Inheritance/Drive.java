package Inheritance.MultiLevel;

import java.util.ArrayList;

public class Drive {
	private String drivename;
	private String drivetype;
	private int numberOffolder;
	
	private ArrayList<String> nameOffolder = new ArrayList<String>();
	private String usedSpace;
	private String freeSpace;
	private String drivecapacity;
	
	public Drive() {
		super();
	}
	
	public Drive(String drivename, String drivetype, int numberOffolder, ArrayList<String> nameOffolder, 
			String usedSpace, String freeSpace, String drivecapacity  )
	{
		super();
		this.drivename = drivename;
		this.drivetype = drivetype;
		this.numberOffolder = numberOffolder;
		this.nameOffolder = nameOffolder;
		this.usedSpace = usedSpace;
		this.freeSpace = freeSpace;
		this.drivecapacity = drivecapacity;
	}
	
	public void displayDrive()
	{
		System.out.println("------------ Drive Details -----------");
		System.out.println("Drive Name : "+ drivename);
		System.out.println("Drive Type : "+ drivetype);
		System.out.println("Number of Folder : "+ numberOffolder);
		System.out.println("Name of Folders : "+ nameOffolder);
		System.out.println("Used Space : "+ usedSpace);
		System.out.println("free Space : "+ freeSpace);
		System.out.println("Drive Capacity : "+ drivecapacity);
		System.out.println("======================================");
	}
}




