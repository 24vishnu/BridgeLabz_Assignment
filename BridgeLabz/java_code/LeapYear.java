import java.util.Scanner;
class LeapYear
{
	/*
	Properties of leap year :
		1.	Leap Years are any year that can be exactly divided by 4 (such as 2016, 2020, 2024, etc)
		2.	If it can be exactly divided by 100, then it isn't (such as 2100, 2200, etc)
		3.	If it can be exactly divided by 400, then it is (such as 2000, 2400)
	*/
	public static void leapYear_Function(int year)
	{
		if(year%100 == 0)
		{
			if(year%400 == 0)
				System.out.println("Yes! This is Leap Year");
			else
				System.out.println("Sorry! This is not Leap Year");
		}else if(year % 4 == 0)
		{
			System.out.println("Yes! This is Leap Year");
		}else
		{
			System.out.println("Sorry! This is not Leap Year");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year to check it is leap year or not");
		int year = scan.nextInt();
		leapYear_Function(year);
	}
}