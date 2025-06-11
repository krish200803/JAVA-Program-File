package Inheritance.SuperCallStatement;

public class LoanAccount extends BankAccount{
	
	double loanAmt;
	String period;
	String loanType;
	float returnInt;
	
//	public LoanAccount() {
//		super()    // defaultly present , given by compiler
//	}
	
	public LoanAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno,
			double loanAmt, String period, String loanType, float returnInt)
	{
		
		super(name,ifsc,bankName,accountNo,pin,branch,phno);
		
		// In this case BankAccount.java file is inherited by the LoanAccount, instead of reinitializing the local 
		//  variable to the global varible using this keyword, we use super() call statement. 
		// Also we dont need default constructor, the work of the default constructor is done by super() call statement.
		
//		this.name = name;
//		this.ifsc = ifsc;
//		this.bankName = bankName;
//		this.accountNo = accountNo;
//		this.pin = pin;
//		this.branch = branch;
//		this.phno = phno;
		
		this.loanAmt = loanAmt;
		this.period = period;
		this.loanType = loanType;
		this.returnInt = returnInt;
	}
	
	public void displayloanAccount()
	{
		DisplayBankAccount();
		
		System.out.println("------ Loan account Details -----");
		System.out.println("Loan Amount:"+ loanAmt);
		System.out.println("Period:"+ period);
		System.out.println("Loan Type:"+ loanType);
		System.out.println("Return Intrest:"+ returnInt);
	}

}
