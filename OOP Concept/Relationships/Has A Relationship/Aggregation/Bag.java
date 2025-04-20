package principlesOfOops;

import java.util.ArrayList;

public class Bag {
	String brand;
	String type;
	String material;
	double price;
	int capacity;
	String color;
	
	Laptop laptop;
	WaterBottle bottle;
	
	ArrayList<Book> listBook = new ArrayList<>();
	int bookCount = 0;
	ArrayList<Pen> listPen = new ArrayList<>();
	int penCount = 0;
	
	public Bag(String brand, String type, String material, double price, int capacity, String color) {
		super();
		this.brand = brand;
		this.type = type;
		this.material = material;
		this.price = price;
		this.capacity = capacity;
		this.color = color;
		
		System.out.println("Bag is Ready to fill");
	}
	
	public void displayBag() {
		System.out.println("*********** Details of Bag **********");
		System.out.println("Brand : " +brand);
		System.out.println("Type : " +type);
		System.out.println("Material of Bag : " +material);
		System.out.println("Price : " +price);
		System.out.println("Capacity : " +capacity);
		System.out.println("Color : " +color);
		System.out.println("*************************************");
	}
	
	public void addBook( String type, String brand, String subject, String size, int pages, double price) {
		
		if(bookCount <=10) {
			Book book = new Book(type,  brand, subject,  size,  pages,  price);
			listBook.add(book);
			bookCount++;
			if(bookCount == 1) {
				System.out.println(bookCount+" Book has been inserted in the bag!");
			}else {
				System.out.println(bookCount+" Books has been inserted in the bag!");
			}
			
			for(Book ele:listBook) {
				ele.displayBook();
			}
			
		}else {
			System.out.println("insufficient space!!");
		}
		
	}
	
	public void addPen( String type, String brand, String color, double price) {
		
		if(penCount <= 10) {
			Pen pen = new Pen(type, brand, color, price);
			listPen.add(pen);
			penCount++;
			if(penCount == 1) {
				System.out.println(penCount+" Pen has been added in the bag!");
			}else {
				System.out.println(penCount+" Pens has been added in the bag!");
			}
			
			for(Pen ele:listPen) {
				ele.displayPen();
			}
			
		}else {
			System.out.println("insufficient space!!");
		}
	}
	
	public void addWaterBottle( String brand, String material, String capacity, double price) {
		bottle = new WaterBottle( brand, material, capacity, price);
	}
	
	public void addLaptop(String brand, String model, double price){
		laptop = new Laptop(brand, model, price );
	}
}