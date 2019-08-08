/*
javac -d . MyUtil.java
*/

package my_util_package;

import java.util.*;
class MyUtil
{
	public static boolean anagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;

		String s1 = str1;//.toLowerCase();
		String s2 = str2;//.toLowerCase();
		int [] freq = new int[128];
		for(int i = 0; i < s1.length(); i++)
		{
			freq[s1.charAt(i)]++;
		}
		for(int i = 0; i < s2.length(); i++)
		{
			if(freq[s2.charAt(i)] == 0)
				return false;
			freq[s2.charAt(i)]--;
		}
		for(int i = 0; i < 128; i++)
		{
			if(freq[i] < 0)
				return false;
		}
		return true;
	}

	public static boolean palindrome(String str)
	{
		for(int i = 0, j = str.length()-1; i <= j; i++, j--)
		{	if(str.charAt(i) == str.charAt(j))
				continue;
			else
				return false;
		}
		return true;
	}

	public static boolean isPrime(int n)
	{
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		for(int i = 2; i*i <= n; i++)
			if(n%i == 0)
				return false;
		return true;
	}

	public static < E > void l_search( E[] inputArray, E x) {
      for(E element : inputArray) {
      	if(element == x){
         System.out.printf("find element %s ", element);
         return;
      	}
      }
      System.out.println("Element "+x+" Not present in list");
   	}

	public static boolean linearSearch(Object []list, Object o)
	{
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] == o)
				return true;
		}
		return false;
	}

//This is only for integer values ans ensure list of elements should be sorted.
	public static < E > void b_Search( E[] ar, E num)
	// public static boolean b_Search(int ar[], int num)
	{
		int i = 0, j = ar.length-1;
		while(i <= j)
		{
			int mid = i + (j-i)/2;
			System.out.println("find element  "+ ar[mid]);

			if(ar[mid] == num){
				// System.out.printf("find element %s ", num);
				return true;
			}
			else if(ar[mid].compareTo(num) > 0)
			// else if(ar[mid] < num)
			{
				i = mid + 1;
			}else
			{
				j = mid -1;
			}
		}
		// System.out.println("Element "+num+" Not present in list");
		return false;
	}

public static boolean b_SearchString(String [] ar, String str){
		int i = 0, j = ar.length-1;
		while(i <= j)
		{
			int mid = (i+j)/2;
			if(ar[mid].equals(str))
				return true;
			else if(ar[mid].compareTo(str) > 0){
				j = mid-1;
			}else
				i = mid + 1;
		}
		return false;
	}

	public static void bubbleSort(int []ar)
	{
		int n = ar.length;
		for(int i = 0;i < n; i++)
		{
			for(int j = 1; j < n; j++)
			{
				if(ar[j] < ar[j-1])
				{
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
		//return ar;
	}
	public static void stringBubbleSort(String [] ar)
	{
		for(int i = 0; i < ar.length; i++){
			for(int j = 0; j < ar.length-1; j++)
			{
				if(ar[j].compareTo(ar[j+1]) > 0)
				{
					String temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}

	public static void insertionSort(int []ar)
	{
		int n = ar.length;
		for(int i = 1; i < n; i++)
		{
			int k = ar[i];
			int j = i-1;
			while(j >= 0 && ar[j] > k)
			{
				ar[j+1] = ar[j];
				j = j-1;
			}
			ar[j+1] = k;
		}
		//return ar;
	}
	
	public static void stringInsertionSort(String [] ar)
	{
		for(int i = 1; i < ar.length; i++){
			String key = ar[i];
			int j = i-1;
			while(j >= 0 && ar[j].compareTo(key) > 0){
				ar[j+1] = ar[j];
				j = j-1;
			}
			ar[j+1] = key;
		}
	}

	public static int calculateDay(int year, int month, int day)
	{
		int y0 = year -(14 - month)/12;
		int x = y0 + (y0/4) -(y0/100) + (y0/400);
		int m0 = month + 12*((14-month)/12)-2;
		int d0 = (day + x + 31*m0/12) % 7;
		// System.out.println(days[d0-1]);
		return d0;
	}

	public static double temperaturConversion(int op, double temp)
	{
		if(op == 1)
		{
			return (temp*(9.0/5) + 32);
		}else
		{
			return ((temp - 32) * (5.0/9));
		}
	}
	public static void monthlyPayment(double P, double Y, double R)
	{
		double n = 12 *  Y;
		double r = R / (12 * 100);
		double output = (P*r)/(1 - Math.pow((1+r), (-n)));
		System.out.format(" monthly Payment is : %.2f ",output);
	}
}