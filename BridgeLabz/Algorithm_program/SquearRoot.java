import java.util.Scanner;
class SquearRoot
{
	public static double my_Sqrt(double n)
	{
		double eps = 1e-15;
        double res = n;
        while (Math.abs(res - n/res) > eps*res) {
            res = (n/res + res) / 2.0;
        }
        return res;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number to find sqrt : ");
		double c = scan.nextDouble();
		System.out.format("%.5f \n",my_Sqrt(c));
	}
}