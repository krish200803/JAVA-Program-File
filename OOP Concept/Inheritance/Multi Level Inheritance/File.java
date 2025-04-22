package Inheritance.MultiLevel;

import java.util.ArrayList;

public class File extends Folder{
	private String fileName;
	private String fileType;
	private String fileLocation;
	private String fileSize;
	private String dateCreated;
	
	public File() {
		super();
	}
	
	public File(String fileName, String fileType, String fileLocation, String fileSize, String dateCreated,
										//Folder Attributes
			String foldername, String foldertype, int numberOffiles,  ArrayList<String> nameOffile,
			String folderlocation, String foldersize, String dateCreated1,
            							// Attributes of Drive
			String drivename, String drivetype, int numberOffolder, ArrayList<String> nameOffolder, 
			String usedSpace, String freeSpace, String drivecapacity)
	{
		super(foldername, foldertype, numberOffiles, nameOffile, folderlocation, foldersize, dateCreated1,
										// Drive formal Arguments 
				drivename, drivetype, numberOffolder, nameOffolder, usedSpace, freeSpace, drivecapacity);
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileLocation = fileLocation;
		this.fileSize = fileSize;
		this.dateCreated = dateCreated;
	}
	
	public void displayFile()
	{
		System.out.println("------------ File Details ------------");
		System.out.println("File Name : "+ fileName);
		System.out.println("File Type : "+ fileType);
		System.out.println("File Location : "+ fileLocation);
		System.out.println("File Size : "+ fileSize);
		System.out.println("Date Crated : "+ dateCreated);
		System.out.println("======================================");
	}
}


