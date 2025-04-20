package HasARelationship.Aggregation;

public class Book {
	String type;
	String brand;
	String subject;
	String size;
	int pages;
	double price;
	
	public Book(String type, String brand, String subject, String size, int pages, double price) {
		super();
		this.type = type;
		this.brand = brand;
		this.subject = subject;
		this.size = size;
		this.pages = pages;
		this.price = price;
		
		
		System.out.println("===================================");
	}
	
	
	public void displayBook() {
		System.out.println("-----Book Details-------");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Subject : "+subject);
		System.out.println("size : "+size);
		System.out.println("Number of Pages : "+pages);
		System.out.println("price : "+price);
		System.out.println("==============================");
		
	}
	
}
