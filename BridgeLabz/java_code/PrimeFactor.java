import java.util.Scanner;

class PrimeFactor
{
	/*
	Following function for check a number is prime or not (assume n is grater than or equal to 2)
	*/
	public static boolean prime(int n)
	{
		if(n == 2)
			return true;
		for(int i = 2; i*i <= n; i++)
			if(n%i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number \t");
		int N = scan.nextInt();
		if(N < 0)
		{
				System.out.println("-");
		}
		for(int i = 2; i < N; i++)
		{
			if(N%i == 0 && prime(i))
				System.out.print(i+" ");
		}
	}
}