package Interface;

public class InstaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instagram i1 = new InstaImp2("Raju","Raju123");
		
		i1.post("I am Happy Today!...");
		
		i1.like("Anjel Priya");
		
		i1.comment("Anjel Priya", "How ?");
		i1.comment("RAju", "May I know who is this? ");
		
		i1.message("Anjel Priya", "Hii How do you know me ?");
		i1.message("Anjel Priya", "Are you Busy ???");
		
		i1.story("I am very sad Today !!!");
		
		i1.comment("Angel Priya", "How?");
		
		Instagram.message("Raju");
		
		
		
		

	}

}
