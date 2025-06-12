package Inheritance.DerivedTypecasting.Upcasting;

public class LoanAccount extends BankAccount{
	
	double loanAmt;
	String period;
	String loanType;
	float returnInt;
	

	
	public LoanAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno,
			double loanAmt, String period, String loanType, float returnInt)
	{
//		super();     // default add by compiler in every constructor and it is always the 1st statement, we cant see .
		super(name, ifsc, bankName, accountNo, pin, branch, phno);
		
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
