import java.util.Scanner;
class Evm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bjp=0, cng = 0 , ss = 0, aap =0, mns = 0, nota =0;
		System.out.println();
		System.out.println("=================WELCOME==================");
		System.out.println();
		System.out.print("enter the population: ");
		int population = sc.nextInt();

		for(int i = 1; i <= population ; i++)
		{
			System.out.println("*****List of Parties*****");
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println("\n Enter the option: ");
			int opt = sc.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt == 1)
				{
					bjp++;
					System.out.println("achhe din nhi ayenge");
				}
				if(opt == 2)
				{
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(opt == 3)
				{
					ss++;
					System.out.println("MAHARSHATRA MAHDE FAKT MARATHI");
				}
				if(opt == 4)
				{
					aap++;
					System.out.println("MUJE AZAD KARO");
				}
				if(opt == 5)
				{
					mns++;
					System.out.println("JAI MAHARASHTRA");
				}
				if(opt == 6)
				{
					nota++;
					System.out.println("THAT'S LIKE A BRAVE MAN");
				}
			}

			if(!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("GALAT RASTE PE JAA RAHE HOOO");
			}
			
			



		}
		if(bjp >= cng && bjp >= ss && bjp >= aap && bjp >= mns)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+bjp+" votes.");
			}
			if(cng >= ss && cng >= ss && cng >= aap && cng >= mns)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+cng+" votes.");
			}
			if(ss >= cng && ss >= bjp && ss >= aap && ss >= mns)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+ss+" votes.");
			}
			if(aap >= cng && aap >= ss && aap >= bjp && aap >= mns)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+aap+" votes.");
			}
			if(mns >= cng && mns >= ss && mns >= aap && mns >= bjp)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+mns+" votes.");
			}


	}
}


