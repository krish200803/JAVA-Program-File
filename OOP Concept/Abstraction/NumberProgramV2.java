package Abstraction;

public class NumberProgramV2 extends NumberPrograms{
	
	public void PrimeNum(int num)   // 10
	{
		int cnt = 0;
		for(int i=2; i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
				System.out.print(i+" ");
			}
		}
	
		System.out.println();
		System.out.println(cnt==0?(num+" is a Prime Number "):(num+" is not a Prime Number "));
		
											// OR

//		System.out.println((num == 2 || num == 3 || num == 5)?(num+" is a Prime"):((num % 2 == 0 || num % 3 == 0 || num % 5 == 0)?(num+" is not Prime"):(num+" is a Prime")));
	}
	
	
	public void Factorial(int num) // 5
	{
		int fact = 1;

		for(int i=num ; i>=1; i--)
		{
			fact = fact * i;
		}
		System.out.println("The Factorial of Digit is: "+ fact);   // 120
	}
	
	public void Factor(int num)  // 10
	{
		for(int i=1; i<=num ; i++)
		{
			if(num%i==0)
				System.out.println("Factors of " + num +" is " + i+" ");
		}
	}
	
	public void PrimeFactor(int num)
	{
		for(int i = 2; i< num; i++) {
	         while(num%i == 0) {
	            System.out.print("The prime Factors are: " + i +" ");
	            num = num/i;
	         }
	      }
	      if(num >2) {
	         System.out.println(num);
	      }
	}
	
	

}
