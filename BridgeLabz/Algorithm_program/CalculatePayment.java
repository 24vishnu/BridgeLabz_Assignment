/*
	Write a Util Static Function to calculate ​ monthlyPayment that reads in three
	command-line arguments P, Y, and R and calculates the monthly payments you
	would have to make over Y years to pay off a P principal loan amount at R per cent
	interest compounded monthly.
*/

// package my_util_package;
// import my_util_package.MyUtil;
import java.util.Scanner;

class CalculatePayment
{
	public static void monthlyPayment(double P, double Y, double R)
	{
		double n = 12 *  Y;
		double r = R / (12 * 100);
		double output = (P*r)/(1 - Math.pow((1+r), (-n)));
		System.out.format(" monthly Payment is : %.2f ",output);
	}
	public static void main(String[] args) 
	{
		// MyUtil obj = new MyUtil();
		double P,Y, R;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal loan amount : ");
		P = scan.nextDouble();
		System.out.println("How many year to pay : ");
		Y = scan.nextDouble();
		System.out.println("Enter rate of interest : ");
		R = scan.nextDouble();
		monthlyPayment(P, Y, R);
	}
}