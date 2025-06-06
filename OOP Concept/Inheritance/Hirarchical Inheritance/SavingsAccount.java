package Inheritance.Hirarchical;

public class SavingsAccount extends BankAccount{

	double balance;
	double intrest;
	double transLimit;
	
	public SavingsAccount(){
		
	}

	SavingsAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno, 
			double balance, double interest, double transLimit)
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
