package Inheritance.SingleLevel;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s1 = new SavingsAccount("Umesh", "123umesh123", "SBI", 123456789, 1234, "Satpur MIDC", 
				587421254, 20000, 3, "Savings Account");
		
		s1.DisplayBankAccount();
		System.out.println("-----------------------------------");
		
		s1.DisplaySavingsAccount();
			
	}

}
