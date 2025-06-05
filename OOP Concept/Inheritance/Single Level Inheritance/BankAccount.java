package Inheritance.SingleLevel;

public class BankAccount {

	String name;
	String ifsc;
	String bankName;
	long accountNo;
	int pin;
	String branch;
	long phno;
	
	public BankAccount() {
		
	}
	
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
		System.out.println(name);
		System.out.println(ifsc);
		System.out.println(bankName);
		System.out.println(accountNo);
		System.out.println(pin);
		System.out.println(branch);
		System.out.println(phno);
	}
}

