package Inheritance.SuperCallStatement;

public class BankAccount {

	String name;
	String ifsc;
	String bankName;
	long accountNo;
	int pin;
	String branch;
	long phno;
	
//	public BankAccount() {
//		super()    // defaultly present , given by compiler
//	}
//	
	public BankAccount(String name, String ifsc, String bankName, long accountNo, int pin, String branch, long phno)
	{
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
