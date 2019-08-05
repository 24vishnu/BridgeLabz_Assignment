import java.util.Scanner;

class HarmonicNumber
{
	/*
		In mathematics, the N-th harmonic number is the sum of the reciprocals of the first N natural numbers:
		lets N = 5
		result =  1/1 + 1/2 + 1/3 + 1/4 + 1/5
	*/
		public static double HarmonicSum(int N)
		{
			if(N == 0)
			{
				System.out.println("Incorrect Input");
				System.exit(0);
			}
			double result = 0;
			while(N > 0)
			{
				result += 1.0/N;
				N -= 1;
			}
			return result;
		}
	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a positive number for find N-th Harmonic Number of that number\t");
			int N = scan.nextInt();
			System.out.println(HarmonicSum(N));
	}
}