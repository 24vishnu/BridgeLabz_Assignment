
package my_util_package;

import java.util.*;
import my_util_package.MyUtil;

class SortSearch
{
	public static void main(String[] args) {
		MyUtil obj = new MyUtil();
//Search Integer element in Array using Binay search search
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