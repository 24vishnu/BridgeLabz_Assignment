package my_util_package;

import java.util.*;
import my_util_package.MyUtil;

class Exteded_Class
{
	public static void main(String[] args) {
		MyUtil obj = new MyUtil();
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
	}
}