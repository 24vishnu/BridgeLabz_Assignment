import java.util.Scanner;

class BonaryConversion
{
	public static String toBinary(int n)
	{
		String str = "";
		int i = 0;
		while(n > 0)
		{
			str = (n%2) + str;
			n /= 2; 
		}
		return str;
	}
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int num = scan.nextInt();
		 System.out.println(toBinary(num));
	}
}