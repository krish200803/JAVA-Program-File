package principlesOfOops;

public class BankAccount {
	private String username;
	private String bankName;
	private long AccNo;
	private int pin;
	private String ifsc;
	private double balance;
	
	
	BankAccount(String username, String bankName, long AccNo, int pin, String ifsc, double balance)
	{
		this.username = username;
		this.bankName = bankName;
		this.AccNo = AccNo;
		this.pin = pin;
		this.ifsc = ifsc;
		this.balance = balance;
		
		System.out.println("Account Created Successfully");
	}
	
	
	// Getters================================================================================
	
	public String getusername(){
		return username;
	}
		
	public String getbankName() {
		return bankName;
	}
	
	public long getAccNo() {
		return AccNo;
	}
	
	public String getifsc() {
		return ifsc;
	}
	
	public double getbalance( long AccNo, int pin) {
		if(this.AccNo == AccNo && this.pin == pin){
			
			return balance;
		}
		else 
		{
			System.out.println("Invalid Credentials");
			return 0;
		}
	}
	
	
	// Setters========================================================================
	
	public void setpin(long AccNo, int oldpin, int newpin)
	{
		if(this.AccNo == AccNo && pin == oldpin) {
			
			pin = newpin;
			System.out.println("Pin Updated");
		}
		else 
		{
			System.out.println("Invalid Credentials");
		}
	}
//------------------------------------------------------------------------------------------	
	public void credit(long AccNo, int pin, double amt)
	{
		if(this.AccNo == AccNo && this.pin == pin)
		{
			if(amt > 0)
			{
				balance += amt;
				System.out.println("Amount Credited");
			}
			else 
			{
				System.out.println("Invalid Amount");
			}
			
		}
		else 
		{
			System.out.println("Invalid Credentials");
		}
	}
	
//--------------------------------------------------------------------------------------------	
	public void debit(long AccNo, int pin, double amt)
	{
		if(this.AccNo == AccNo && this.pin == pin)
		{
			if(amt > 0)
			{
				if(balance - amt > 1000)
				{
					balance -= amt;
					
					System.out.println("Amount Debitted");
				}
				else 
				{
					System.out.println("Insufficient Balance");
				}				
			}
			else 
			{
				System.out.println("Invalid Amount");
			}
		}
		else 
		{
			System.out.println("Invalid Credentials");
		}
	}
	
}


