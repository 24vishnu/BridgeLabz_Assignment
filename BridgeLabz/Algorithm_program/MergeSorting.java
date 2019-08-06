import java.util.*;
class MergeSorting
{
	private ArrayList<String> list;

	//This is constructor of class
	public MergeSorting(ArrayList<String> given_list)
	{
		this.list = given_list;
	}
	public void startSorting()
	{
		divideList(0, list.size()-1);
	}

	
	public void divideList(int start, int end)
	{
		if(start <= end && (end-start) > 0)
		{
			int mid = start + (end - start)/2;
			divideList(start, mid);
			divideList(mid+1, end);

			merge(start, mid, end);
		}
	}
	public void merge(int start, int mid, int end)
	{
		ArrayList<String> result = new ArrayList<String>();
		int begin = start;
		int last = mid+1;
		while(begin <= mid && last <= end)
		{
			if(list.get(begin).compareTo(list.get(last)) <= 0)
			{
				result.add(list.get(begin));
				begin++;
			}else{
				result.add(list.get(last));
				last++;
			}
		}
		while(begin <= mid)
		{
			result.add(list.get(begin));
			begin++;
		}
		while(last <= end)
		{
			result.add(list.get(last));
			last++;
		}
		// for(String str : list)
		// 	System.out.print(str+" ");
		// System.out.println(result);
		int i = 0; 
		int j = start;
		while(i < result.size())
		{
			list.set(j,result.get(i++));
			j++;
		}
	}
	public void printlist()
	{
		System.out.println(list);
	}

	public static void main(String[] args) 
	{
		// Scanner scan = new Scanner(System.in);
		String []ar = {"vishnu","akhilesh","chandan","bhanu","rajesh","souman","pankaj","deepak","shudeer","manish","shubhasis"};
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < ar.length; i++)
			list.add(ar[i]);
		MergeSorting ms = new MergeSorting(list);

		System.out.println("Unsorted list : \n"+ list);
		System.out.println("Sorted list : \n");
		ms.startSorting();
		ms.printlist();
	}
}