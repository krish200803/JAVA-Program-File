package Inheritance.DerivedTypecasting.Upcasting;

public class SavingsAccount extends BankAccount{
	
	double balance;
	double intrest;
	double transLimit;
	
	public SavingsAccount(){
		//super()    // defaultly present , given by compiler
	}

	SavingsAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno, 
			double balance, double interest, double transLimit)
	{
//		super();     // default add by compiler in every constructor and it is always the 1st statement, we cant see .
		
		super(name, ifsc, bankName, accountNo, pin, branch, phno);
		
		this.balance = balance;
		this.intrest = interest;
		this.transLimit = transLimit;
	}
	
	public void DisplaySavingsAccount()
	{
		DisplayBankAccount();
		
		System.out.println("------ Savings account Details -----");
		System.out.println("Balance Amount:"+ balance);
		System.out.println("Intrest Rate:"+ intrest);
		System.out.println("Transaction Limit:"+ transLimit);
	}

}
