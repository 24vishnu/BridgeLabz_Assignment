/*
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.
*/
import java.util.*;
class CouponNumber
{
	//Generate a random number
	public static int randomGenrate(int n){
		Random rand = new Random();							// object of random class
		return rand.nextInt(n+1);							// Generate a integer random number
	}
	// Following function is chacking one by one a coupon is already generated or not
	public static boolean checkNew(ArrayList<Integer> ar,int n)
	{
		for(int i : ar)
		{
			if(n == i)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();	//A list to store N distinct coupon numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many number you want to generate\t");
		int N = scan.nextInt();								// N for number of distinct coupons
		int count = 0;										// Count for how many times we try to generate
		while(ar.size() < N)								//while loop for generate N distinct coupons
		{
			count++;										// count increase by one
			int x = randomGenrate(N);						// generate a random numbre less than or equal to N
			//if(!ar.contain(x))
			if(!checkNew(ar,x)){							// check it is in list alredy generated or not 
				ar.add(x);									// if not then add in list
			}
		}
		System.out.println("Total Number of try : "+count);						// print how many number of time we try
		System.out.println("Following are the generated coupons \n"+ar);								// print distinct numbers

	}
}