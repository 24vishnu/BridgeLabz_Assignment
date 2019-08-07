/*
To the Util Class add ​ dayOfWeek static function that takes a date as input and
prints the day of the week that date falls on. Your program should take three
command-line arguments: m (month), d (day), and y (year). For m use 1 for January,
2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for
Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where
/ denotes integer division):
*/

//javac -d . DayOfWeek.java
package my_util_package;
import my_util_package.MyUtil;
import java.util.Scanner;

class DayOfWeek
{
	/*
		int year;
		int month;
		int day;
		int [] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		DayOfWeek(int d, int m, int y)
		{
			this.day = d;
			this.month = m;
			this.year = y;
		}
	*/

	static String [] days ={"Sunday", "Monday", "Tuesday", "Wednesday", " Thursday", "Friday","Saturday"};

	public static void main(String[] args) {
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = scan.nextInt();
		System.out.println("Enter month: ");
		int month = scan.nextInt();
		System.out.println("Enter day: ");
		int day = scan.nextInt();
	*/	
		MyUtil obj = new MyUtil();
		int x = obj.calculateDay(2019, 8, 7);	//obj.calculateDay(year, month, day);
		System.out.println(days[x]+"\n");
	}
}