import java.util.*;
class FilpCoin
{
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();							//An instance of this (Random) class is used to generate a stream of pseudorandom numbers. The class uses a 48-bit seed, which is modified using a linear congruential formula.
			System.out.println("Enter How many time you want to flip coin\t");
			int N = scan.nextInt();
			if(N < 1)
			{
				System.out.println("Please Enter positive number grater than 0");
				return;
			}
			int head = 0, tails = 0;							//Initial head and tails is assigne with 0
			for(int i =0; i < N; i++)
			{
				double x = rand.nextDouble();					//Returns the next pseudorandom, uniformly distributed double value between 0.0 and 1.0 from this random number generator's sequence.
				if(x < 0.5)										//Check condition
					tails++;									//If true incerease tails count by one
				else
					head++;										//else increase head count by one
			}
			System.out.println("Head % is : "+((head*100)/N));	//Print % of head occure in total N toss
			System.out.println("Tails % is : "+((tails*100)/N));//Print % of tails occure in total N toss
		}	
}