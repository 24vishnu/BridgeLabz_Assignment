import java.util.Scanner;
class ADS{
		public static <E extends Comparable>  void b_Search( E[] ar, E num)
	{
		int i = 0, j = ar.length-1;
		while(i <= j)
		{
			int mid = i + (j-i)/2;
			// System.out.println("find element  "+ ar[mid]);

			if(ar[mid] == num){
			System.out.println("find element  "+ ar[mid]);

				// return true;
			}
			else if(ar[mid].compareTo(num) > 0)
			{
				i = mid + 1;
			}else
			{
				j = mid -1;
			}
		}
		// return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			Integer []ar = new Integer[10];
		System.out.println("Enter 10 elements");
		for(int i = 0; i < 10; i++)
		{
			ar[i] = (Integer)s.nextInt();
		}
		System.out.println("Enter elements for search");
		Integer ele =(Integer)s.nextInt();
		b_Search(ar,ele);
		// 	System.out.println("Found");
		// else
		// 	System.out.println("Not Found");
		}	
}