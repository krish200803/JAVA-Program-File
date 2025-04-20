package HasARelationship.Composotion;

public class Refil {
	String color;
	double size;
	String refilType;
	
	
	public Refil() {};
	
	public Refil(String color, double size, String refilType)
	{
		super();
		this.color = color;
		this.size = size;
		this.refilType = refilType;
	}
	
	public void displayRefil()
	{
		System.out.println("---------- Details of Refil ------------");
		System.out.println("Color : "+ color);
		System.out.println("Size of Refil :" + size);
		System.out.println("Type of Refil : "+ refilType);
		System.out.println("****************************************");
		
	}
}
