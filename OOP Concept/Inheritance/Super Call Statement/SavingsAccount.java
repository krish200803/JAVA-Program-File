package Inheritance.SuperCallStatement;

public class SavingsAccount extends BankAccount{

	double balance;
	double intrest;
	double transLimit;
	
//	public SavingsAccount(){
//		super()    // defaultly present , given by compiler
//	}

	SavingsAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno, 
			double balance, double interest, double transLimit)
	{
		super(name,ifsc,bankName,accountNo,pin,branch,phno);
		
		// In this case BankAccount.java file is inherited by the SavingsAccount, instead of reinitializing the local 
		//  variable to the global varible using this keyword, we use super() call statement. 
		// Also we dont need default constructor, the work of the default constructor is done by super() call statement.
		
//		this.name = name;
//		this.ifsc = ifsc;
//		this.bankName = bankName;
//		this.accountNo = accountNo;
//		this.pin = pin;
//		this.branch = branch;
//		this.phno = phno;
		
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
