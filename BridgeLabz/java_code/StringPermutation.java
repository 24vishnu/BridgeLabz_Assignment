/*
Write static functions to return all permutation of a String using iterative method 
and Recursion method. Check if the arrays returned by two string functions are equal.
*/
import java.util.*;
class StringPermutation
{
	public static void permutationIterate(String str)
	{
		List<String> lis = new ArrayList<String>();
		lis.add(String.valueOf(str.charAt(0)));
		for(int i = 1; i < str.length(); i++)
		{
			for(int j = lis.size()-1; j >= 0; j--)
			{
				String st = lis.remove(j);
				for(int k =0; k <= st.length(); k++){
					lis.add(st.substring(0,k) + str.charAt(i) + st.substring(k));
					// System.out.println(str.substring(j,str.length()).concat(str.substring(0,j)));
				}
			}
		}
		System.out.println(lis);
	}
	public static void permutaionRecursion(String str, int l, int r)
	{
		if(l == r)
			System.out.println(str);
		else
		{
			for(int i=l; i <= r; i++)
			{
				str = swap(str,l,i);
				permutaionRecursion(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}
	public static String swap(String st, int i, int j)
	{
		char temp;
		char [] charArray = st.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	public static void main(String[] args) 
	{
		String  str = "vis";
		int n = str.length();
			permutaionRecursion(str,0,n-1);
			permutationIterate("vis");
	}
}