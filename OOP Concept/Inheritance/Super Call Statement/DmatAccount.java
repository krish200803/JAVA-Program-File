package Inheritance.SuperCallStatement;

public class DmatAccount extends BankAccount{

	int balanceAmt;
	float brokeagePer;
	int holdings;
	long portfolioId;
	
//	public DmatAccount() {
//		super()    // defaultly present , given by compiler
//	}
	
	public DmatAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno,
			int balanceAmt, float brokeagePer, int holdings, long portfolioId)
	{
		super(name,ifsc,bankName,accountNo,pin,branch,phno);
		
		// In this case BankAccount.java file is inherited by the DmatAccount, instead of reinitializing the local 
		//  variable to the global varible using this keyword, we use super() call statement. 
		// Also we dont need default constructor, the work of the default constructor is done by super() call statement.
		
		
//		this.name = name;
//		this.ifsc = ifsc;
//		this.bankName = bankName;
//		this.accountNo = accountNo;    // Instead of manually load the non-static members, we use Super() call statement.
//		this.pin = pin;
//		this.branch = branch;
//		this.phno = phno;
		
		this.balanceAmt = balanceAmt;
		this.brokeagePer = brokeagePer;
		this.holdings = holdings;
		this.portfolioId = portfolioId;
	}
	
	public void displayDmatAccount()
	{
		DisplayBankAccount();
		
		System.out.println("------ Dmat account Details -----");
		System.out.println("Balance Amount:"+balanceAmt);
		System.out.println("Brokeage Percent:"+ brokeagePer);
		System.out.println("Holdings:"+ holdings);
		System.out.println("Portfolio ID:"+ portfolioId);
	}
}
