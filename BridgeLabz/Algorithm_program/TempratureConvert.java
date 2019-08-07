/*
	To the Util Class add ​ temperaturConversion static function, given the temperature
	in fahrenheit as input outputs the temperature in Celsius or viceversa using the
	formula
	Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
	Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
	return (temp - 32)*(5/9);
*/
package my_util_package;
import my_util_package.MyUtil;
import java.util.Scanner;
class TempratureConvert 
{

	public static void main(String[] args) 
	{
		MyUtil obj = new MyUtil();
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your option \n1.	Celsius to Fahrenheit.\n2.	Fahrenheit to Celsius.");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter the temperature in Celsius. : ");
			double cel = scan.nextDouble();
			System.out.format("Temperature in Fahrenheit is : %.4f °F\n",obj.temperaturConversion(choice, cel));

		}else if(choice == 2)
		{
			System.out.println("Enter the temperature in fahrenheit. : ");
			double frt = scan.nextDouble();
			System.out.format("Temperature in Celsius is : %.4f °C\n",obj.temperaturConversion(choice, frt));
		}else{
			System.out.println("You Entered incorrect option ");			
		}	
	}
}