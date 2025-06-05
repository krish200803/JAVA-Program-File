package Inheritance.SingleLevel;

public class SavingsAccount extends BankAccount{
	
	double balance;
	double intrest;
	String type;
	
	public SavingsAccount(){
		
	}

	SavingsAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno, 
			double balance, double interest, String type)
	{
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
		this.balance = balance;
		this.intrest = interest;
		this.type = type;
	}
	
	public void DisplaySavingsAccount()
	{
		DisplayBankAccount();
		
		System.out.println(balance);
		System.out.println(intrest);
		System.out.println(type);
	}
}
