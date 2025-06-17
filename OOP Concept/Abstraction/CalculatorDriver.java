package Abstraction;

public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new CalculatorV2(); // here we do upcasting because we cannot create the object of abstract class
		
		c1.addition(5, 4);
		
		c1.subtraction(10, 3);
		
		c1.division(20, 10);
		
		c1.multiplication(2, 5);
		
		System.out.println(c1.brand);

	}

}
