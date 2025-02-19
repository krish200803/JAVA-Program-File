class Cencius 
{
	public static void main(String[] args) 
	{
		long currpop = 312032486l;
		final long second = (365*24*60*60)*5;
		long birth = second/7;
		long death = second/13;
		long imm = second/45;

		long newpop = currpop + birth - death + imm;
		System.out.println("Current poplation :"+ currpop);     // Current poplation :312032486
		System.out.println("New population :"+ newpop);         // New population :325932970
	}
}
