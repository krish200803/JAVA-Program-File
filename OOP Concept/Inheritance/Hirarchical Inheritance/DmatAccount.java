package Inheritance.Hirarchical;

public class DmatAccount extends BankAccount{

	int balanceAmt;
	float brokeagePer;
	int holdings;
	long portfolioId;
	
	public DmatAccount() {
		
	}
	
	public DmatAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno,
			int balanceAmt, float brokeagePer, int holdings, long portfolioId)
	{
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
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
