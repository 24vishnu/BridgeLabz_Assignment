/*
	Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
			returned by Vending Machine. Write a Program to calculate the minimum number
			of Notes as well as the Notes to be returned by the Vending Machine as a Change
	I/P -> 	read the Change in Rs to be returned by the Vending Machine
	Logic-> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes.
	O/P -> 	Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change
*/
	import java.util.Scanner;
	class VendingMachine
	{
		static int count = 0;
		// enum Notes{1, 2,5,10,50,100,500,1000};
		public static void conuntNote(int rupe)
		{
			if(rupe == 0){
				System.out.println("Total : "+count);
				return;
			}

			count++;
			if(rupe >= 1000)
			{
				System.out.println(1000);
				rupe -= 1000;
				conuntNote(rupe);
			}else if(rupe >= 500)
			{
				rupe -= 500;
				System.out.println(500);
				conuntNote(rupe);
			}else if(rupe >= 100)
			{
				rupe -= 100;
				System.out.println(100);
				conuntNote(rupe);
			}else if(rupe >= 50)
			{
				rupe -= 50;
				System.out.println(50);
				conuntNote(rupe);
			}else if(rupe >= 10)
			{
				System.out.println(10);
				rupe -= 10;
				conuntNote(rupe);
			}else if(rupe >= 5){
				System.out.println(5);
				rupe -= 5;
				conuntNote(rupe);
			}else if(rupe >= 2)
			{
				rupe -= 2;
				System.out.println(2);
				conuntNote(rupe);
			}else{
				System.out.println(1);
				rupe -= 1;
				conuntNote(rupe);
			}
		}
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter change rupees");
			int change = scan.nextInt();
			conuntNote(change);
		}
	}