package Inheritance.DerivedTypecasting.Upcasting;

public class BankAccount {
	
	String name;
	String ifsc;
	String bankName;
	long accountNo;
	int pin;
	String branch;
	long phno;
	
	public BankAccount() {
		//super()    // defaultly present , given by compiler
	}
	
	public BankAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno)
	{
//		super();     // default add by compiler in every constructor and it is always the 1st statement, we cant see .
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
	}
	
	public void DisplayBankAccount()
	{
		System.out.println("------ Bank account Details -----");
		System.out.println("Account holder Name:"+ name);
		System.out.println("IFSC Code:"+ ifsc);
		System.out.println("Bank Name:"+ bankName);
		System.out.println("Account Number:"+ accountNo);
		System.out.println("ATM Pin:"+ pin);
		System.out.println("Branch:"+ branch);
		System.out.println("Phone No.:"+ phno);
	}

}
