package Inheritance.MultiLevel;

import java.util.ArrayList;

public class DriveFolderFileExample {

	public static void main(String[] args) {
		
		ArrayList<String> fileName1 = new ArrayList<String>();
		fileName1.add("10th Marksheet");
		fileName1.add("12th Marksheet");
		fileName1.add("FE Marksheet");
		fileName1.add("SE Marksheet");
		fileName1.add("TE Marksheet");
		
		ArrayList<String> folderName = new ArrayList<String>();
		folderName.add("My Document");
		folderName.add("Java Qspider");
		folderName.add("Web Development qspider");
		folderName.add("Software");
		folderName.add("Sumago");
		
		
		
		File file = new File("10th MarkSheet", "PDF", "MyDocument Folder", "261 KB", "12/02/2021",
				       					// Folder Actual Arguments
						"MY DOCUMENTS", "FILE FOLDER", 5, fileName1, "D Drive", "32.3 MB", "7/01/2023", 
										// Driver Actual Arguments
						"D Drive", "Local Disk", 5, folderName, "41.2 GB", "208 GB", "249 GB" ) ;
		
		file.displayFile();
		
		file.displayFolder();
		file.displayDrive();

	}

}
