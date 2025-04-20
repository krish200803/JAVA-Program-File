package principlesOfOops;

public class BankDriver {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("umesh123", "SBI", 123456789l, 1234, "SBIN1234", 10000);
		
		System.out.println(b1.getusername());
		System.out.println(b1.getbankName());
		System.out.println(b1.getAccNo());
		System.out.println(b1.getifsc());
		
		System.out.println(b1.getbalance(123456789l, 1234));      // balance 10000.0

		b1.credit(123456789l, 1234, 5000.0);
		System.out.println(b1.getbalance(123456789l, 1234));      // balance 15000.0
		
		b1.setpin(123456789l, 1234, 2003);          // pin updated to 2003
		
		b1.debit(123456789l, 2003, 13000.0);            
		System.out.println(b1.getbalance(123456789l, 2003));      // balance 2000.0
		

	}

}
