package Inheritance.MultiLevel;

import java.util.ArrayList;

public class Folder extends Drive
{
	private String foldername;
	private String foldertype;
	private int numberOffiles;
	private ArrayList<String> nameOffile = new ArrayList<String>();
	
	private String folderlocation;
	private String foldersize;
	private String dateCreated;
	
	public Folder() {
		super();
	}
	
	public Folder(String foldername, String foldertype, int numberOffiles,  ArrayList<String> nameOffile,
			String folderlocation, String foldersize, String dateCreated,
			                     // Attributes of Drive
			String drivename, String drivetype, int numberOffolder, ArrayList<String> nameOffolder, 
			String usedSpace, String freeSpace, String drivecapacity)
{
	super(drivename, drivetype, numberOffolder, nameOffolder, usedSpace, freeSpace, drivecapacity);
	this.foldername = foldername;
	this.foldertype = foldertype;
	this.numberOffiles = numberOffiles;
	this.nameOffile = nameOffile;
	this.folderlocation = folderlocation;
	this.foldersize = foldersize;
	this.dateCreated = dateCreated;
}

	public void displayFolder()
	{
		System.out.println("------------- Folder Details ------------");
		System.out.println("Folder Name : "+ foldername);
		System.out.println("Folder Type : "+ foldertype);
		System.out.println("Number of Files : "+ numberOffiles);
		System.out.println("Name of Files : "+ nameOffile);
		System.out.println("Folder Location : "+ folderlocation);
		System.out.println("Folder Size : "+ foldersize);
		System.out.println("Date Created : "+ dateCreated);
		System.out.println("=========================================");
	}
}

