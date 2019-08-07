package my_util_package;

import java.util.*;
import my_util_package.MyUtil;

public class PrimeNumbers
{
	public static void main(String[] args) {
		MyUtil obj = new MyUtil();
		for(int i = 0; i <= 1000; i++) 
		{
			if(obj.isPrime(i) == true)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}