/*
IMPORTANT NOTE - Create a Util Class and write the 
Anagram, Palindrome, Prime Numbers, Search Algos, Sort Algos, etc
  as a static function
*/
class Util1
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
	public static boolean binarySearch(int ar[], int num)
	{
		int i = 0, j = ar.length()-1;
		while(i <= j)
		{
			int mid = i + (j-i)/2;
			if(ar[mid] == num)
				return true;
			else if(ar[mid] > num)
			{
				i = mid + 1;
			}else
			{
				j = mid -1;
			}
		}
		return false;
	}

	public static void bubbleSort(int ar)
	{
		int n = ar.length;
		for(int i = 0;i < n; i++)
		{
			for(int j = 1; j < n; i++)
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
	public static void insertionSort(int ar)
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

}

public Util{
	public static void main(String[] args) {
		Util1 obj = new Util1();
		//check two strings are anagram or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String str1 = scan.next();
		System.out.println("Enter second string : ");
		String str2 = scan.next();
		if(obj.anagram(str1,str2))
			System.out.println("Yes "+str1+" and "+str2+" are Anagram");
		else
			System.out.println("No "+str1+" and "+str2+" are not Anagram");

	}
}