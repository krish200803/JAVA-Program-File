package Inheritance.DerivedTypecasting.Upcasting;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b1 = new LoanAccount("Umesh", "SBIN123", "SBI", 789456123, 1234, "Deccan", 789412563, 20000.0,
				                    "3 Years", "Education", 9);
		
		SavingsAccount s1 = (SavingsAccount)b1;     // Class Cast Exception
		
		s1.DisplayBankAccount();
		s1.DisplaySavingsAccount();

	}

}
