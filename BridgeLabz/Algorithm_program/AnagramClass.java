/*
Compile : javac -d . AnagramClass.java 
Run : java my_util_package.AnagramClass
*/

package my_util_package;

import java.util.*;
import my_util_package.MyUtil;

public class AnagramClass{
	public static void main(String[] args) {
		MyUtil obj = new MyUtil();
		Scanner scan = new Scanner(System.in);

//check two strings are anagram or not
		System.out.println("Enter first String");
		String str1 = scan.nextLine();
		System.out.println("Enter second string");
		String str2 = scan.nextLine();

		if(obj.anagram(str1,str2))
		{
			System.out.println("Yeahhhhh");
		}else{
			System.out.println("Nooooo");

		}
	}
}