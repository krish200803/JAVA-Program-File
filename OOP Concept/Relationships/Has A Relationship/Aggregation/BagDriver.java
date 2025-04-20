package principlesOfOops;

public class BagDriver {

	public static void main(String[] args) {
		
		Bag bag = new Bag("Sky Bag", "Laptop Bag", "Leather", 1500.0, 4,"Blue" );
		
		bag.displayBag();
		
		bag.addBook("Notebook", "Classmate", "JAVA", "A4", 400, 120);
		bag.addBook("Notebook", "Navneet", "HTML", "A4", 200, 60);
		bag.addBook("Notebook", "Classmate", "SQL", "A4", 300, 90);
		
		
		bag.addPen("Luxor", "BallPen", "Blue", 10);
		bag.addPen("Classmate", "GelPen", "Blue", 10);
		bag.addPen("Nataraj", "BallPen", "Blue", 10);
		
		
		bag.addLaptop("HP", "14s", 40000.0);
		bag.laptop.displayLaptop();
		
		bag.addWaterBottle("Milton", "Stainless Steal", "1 litre", 300.0);
		bag.bottle.displayBottle();
		
		
	}

}
