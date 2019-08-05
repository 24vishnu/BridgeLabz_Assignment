import java.util.*;
class Gambler
{
	public static boolean winner(int A)
	{
		Random rand = new Random();
		int x = rand.nextInt(2);
		if(x == 1)
			return true;
		return false;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please Enter Stake ,Gole and a Number");
		int stake = scan.nextInt();
		int gole = scan.nextInt();
		int N = scan.nextInt();
		int win = 0;
		int loss = 0;
		if(gole <= stake)
		{
			System.out.println("No need to play AIM is less than or equal of current money");
			return;
		}
		while(N > 0)
		{
			if(winner(stake))
			{
				stake++;
				win++;
			}
			else
			{
				stake--;
				loss++;
			}
			if(stake == gole)
			{
			//	System.out.println("Total number of time win = "+win+" : "+loss+"\nPercentage of win : "+((win*100)/(win+loss))+"\nPercentage of loss : "+((loss*100)/(win+loss)));
				break;
			}
			N--;
		}
		System.out.println("Total number of time win = "+win+" : "+loss+"\nPercentage of win : "+((win*100)/(win+loss))+"\nPercentage of loss : "+((loss*100)/(win+loss)));
	}
}