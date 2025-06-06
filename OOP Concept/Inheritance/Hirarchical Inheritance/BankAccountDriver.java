package Inheritance.Hirarchical;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                  //  For Savings Account
		SavingsAccount s1 = new SavingsAccount("Umesh Bhadane","SBIN12345","State Bank of India",1234563123, 
				1234, "Deccan",876123593, 50000.0, 3, 10000.0);
		
		//s1.DisplayBankAccount();
		s1.DisplaySavingsAccount();
		
	                     // For Loan Account
		LoanAccount l1 = new LoanAccount("Manish Bhadane", "ICICI12345", "ICICI", 123456789, 1231, "Nashik", 
				456789123, 30000.0, "3 Years", "Education Loan", 3f);
		
		//l1.DisplayBankAccount();
		l1.displayloanAccount();
		
		                 // Dmat Account
		DmatAccount d1 = new DmatAccount("Om Pawar", "HDFC12345", "HDFC",789456321, 7412 , "Karve Nagar", 
				852369741, 120000, 12.3f, 80000, 747896541);
		
		//d1.DisplayBankAccount();
		d1.displayDmatAccount();
	}

}
