/*
Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. 
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
w = 35.74 + 0.6215 + (0.4275*t - 35.75)*pow(v,0.16)
Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).
*/
import java.util.*;

class WindChill
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature (in Fahrenheit) < 50 : ");
		double t = scan.nextDouble();
		if(t >= 50)
		{
			System.out.println("You entered temperature >= 50  For this formula is not valid");
			System.exit(0);

		}
		System.out.println("Enter wind speed (in miles per hour) : ");
		double v = scan.nextDouble();
		double w = 35.74 + 0.6215 + (0.4275*t - 35.75) * Math.pow(v,0.16);
		System.out.println(w);
	}
}