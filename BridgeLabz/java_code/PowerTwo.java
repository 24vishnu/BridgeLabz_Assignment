import java.util.Scanner;
class PowerTwo
{
	/*
	In java Range of integer is following
		-2147483648 to 2147483647
	Therefor if we take N >= 31 then output of 2^31 is 2147483648 which is out of range
	*/
	public static void powerFunction(int N)
	{
		if(N > 30 || N < 0)
		{
			System.out.println("Please Enter Number between 0 to 31");
			return;
		}
		int result = 1;
		while(N > 0)
		{
			result *= 2;
			N -= 1;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for print power of 2 (Note : number should be between 0 - 31)\t");
		int N = scan.nextInt();
		powerFunction(N);
	}
}