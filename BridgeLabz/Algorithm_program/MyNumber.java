import java.util.Scanner;
class MyNumber
{
	public static int askNumber(int N)
	{
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = N-1;
		while(i <= j)
		{
			int m = i+(j-i)/2;
			System.out.println("Is ("+m+") your Number (1 for yes / 0 for no) :");
			int reply = scan.nextInt();
			if(reply == 1)
			{
				System.out.println("Ok.. ! you got your number : ");
				return m;
			}else{
				System.out.println("your number is grater than or less then (1 for grater / 0 for less) :");
				int myAns = scan.nextInt();
				if(myAns == 1)
					i = m+1;
				else if(myAns == 0){
					j = m-1;
				}else{
					System.out.println(" You Enter incorrect answer");
				}
			}
		}
		System.out.println("Sorry! Dear!! You are cheater No value remain");
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range for searching your Number");
		int N = scan.nextInt();
		System.out.println(askNumber(N));

	}
}