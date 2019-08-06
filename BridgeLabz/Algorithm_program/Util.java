/*
IMPORTANT NOTE - Create a Util Class and write the 
Anagram, Palindrome, Prime Numbers, Search Algos, Sort Algos, etc
  as a static function
*/
  import java.util.*;
class Util1
{
	public static /*boolean*/ anagram(String str1, String str2)
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
	// public static < E > void b_Search( E[] ar, E num)
	public static boolean b_Search(int ar[], int num)
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
			// else if(ar[mid].compareTo(num) > 0)
			else if(ar[mid] < num)
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

}

public class Util{
	public static void main(String[] args) {
		Util1 obj = new Util1();
		Scanner scan = new Scanner(System.in);

//check two strings are anagram or not
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		obj.anagram(str1,str2);
//Find all prime numbers from one to 1000
		/*
		for(int i = 0; i <= 1000; i++) 
		{
			if(obj.isPrime(i) == true)
				System.out.print(i+" ");
		}
		System.out.println();
		*/

//Find number that is anagram and palindrom
	/*
		List<Integer> anag = new ArrayList<Integer>();
		List<String> prime = new ArrayList<String>();
		List<Integer> palin = new ArrayList<Integer>();
		List<Integer> ana_palin = new ArrayList<Integer>();

		for(int i = 10; i <= 1000; i++) 
		{
			if(obj.isPrime(i) == true){
				
				String st = String.valueOf(i);
				char []prn = st.toCharArray();
				Arrays.sort(prn);
				st = String.copyValueOf(prn);
				if(prime.contains(st) == true)
					anag.add(i);
				prime.add(st);
				//if(obj.anagram(st) == true)
				if(obj.palindrome(String.valueOf(i)) == true)
					//System.out.print(i+" ");
					palin.add(i);
				// if(obj.anagram(st) == true)
				// 	anag.add(i);
			}
		}
		for(int a : palin)
		{
			if(anag.contains(a))
				ana_palin.add(a);
		}
		//Collections.sort(prime);

		System.out.println("Following are the prime numbers\n"+prime+"\n\n");
		System.out.println("Following are the Anagram prime Anagram numbers\n"+anag+"\n\n");
		System.out.println("Following are the palindrome numbers\n"+palin+"\n\n");
		System.out.println("Following are the prime and Anagram and palindrome numbers\n"+ana_palin+"\n\n");
	*/
//Search Integer element in Array using Binay search search
		// Integer []ar = new Integer[10];
	/*
		int []ar = new int[10];
		System.out.println("Enter 10 elements");
		for(int i = 0; i < 10; i++)
		{
			ar[i] = scan.nextInt();
		}
		System.out.println("Enter elements for search");
		int ele =scan.nextInt();
		if(obj.b_Search(ar,ele) == true)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	*/

//Search IString element in Array using Binay search search
	/*
		String []ar = new String[10];
		System.out.println("Enter 10 string elements");
		for(int i = 0; i < 10; i++)
		{
			ar[i] = scan.nextLine();
		}
		Arrays.sort(ar);
		System.out.println("Enter an string elements for search");
		String ele =scan.nextLine();
		if(obj.b_SearchString(ar,ele) == true)
			System.out.println("Found");
		else
			System.out.println("Not Found");
*/

//Sorting Integer array using bubble sort
	/*	
		int []ar = new int[10];
		System.out.println("Enter 10 elements");
		for(int i = 0; i < 10; i++)
		{
			ar[i] = scan.nextInt();
		}
		// System.out.println("Following is sorted array");

		obj.bubbleSort(ar);
		System.out.println("Following is sorted array");
		for(int i : ar)
			System.out.print(i+" ");
		System.out.println();
		*/
//Sorting String array using bubble sort
	/*
		String []ar = new String[10];
		System.out.println("Enter 10 elements");
		for(int i = 0; i < 10; i++)
		{
			ar[i] = scan.nextLine();
		}
		// System.out.println("Following is sorted array");

		obj.stringBubbleSort(ar);
		System.out.println("Following is sorted array");
		for(String i : ar)
			System.out.print(i+", ");
		System.out.println();
	*/
//Sorting Integer array using insertion Sort
		
	/*
		int []ar = {643,34,23,7,2,0,73,9348,1,8,100};//new int[10];
		System.out.println("unsorted elements");
		for(int i = 0; i < 10; i++)
		{
			// ar[i] = scan.nextInt();
			System.out.print(ar[i]+", ");
		}
		// System.out.println("Following is sorted array");

		obj.insertionSort(ar);
		System.out.println("\nFollowing is sorted array");
		for(int i : ar)
			System.out.print(i+" ");
		System.out.println();
		*/
//Sorting String array using insertion Sort
	/*
		String []ar = {"vishnu","akhilesh","chandan","bhanu","rajesh","souman","pankaj","deepak","shudeer","manish","shubhasis"};//new int[10];
		System.out.println("unsorted elements\n");
		System.out.print("[");
		for(int i = 0; i < ar.length; i++)
		{
			// ar[i] = scan.nextInt();
			System.out.print(ar[i]+", ");
		}
		obj.stringInsertionSort(ar);
		System.out.println("]\n\nFollowing is sorted array\n");
		System.out.print("[");
		for(String i : ar)
			System.out.print(i+", ");
		System.out.print(" ]");
		System.out.println();
	*/
	}
}