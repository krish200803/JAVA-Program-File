package Inheritance.Hirarchical;

public class LoanAccount extends BankAccount{

	double loanAmt;
	String period;
	String loanType;
	float returnInt;
	
	public LoanAccount() {
		
	}
	
	public LoanAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno,
			double loanAmt, String period, String loanType, float returnInt)
	{
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
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
