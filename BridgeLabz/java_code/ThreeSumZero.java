import java.util.*;

class ThreeSumZero{
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		List<List<Integer> > res = new ArrayList<List<Integer> >();
		System.out.println("How many value you want to enter : ");
		int N = scan.nextInt();
		int []ar = new int[N];// = {1,-1,2,0,-2,4,-2,-2,4,-2,-2,-2,4,4,4,3};
		System.out.println("Enter "+N+" values now");
		for(int i = 0; i < N; i++)
			ar[i] = scan.nextInt();

		for(int i = 0; i < N-2; i++)
		{
			for(int j = i+1; j < N-1; j++)
			{
				for(int k = j+1; k < N; k++)
				{
					if(ar[i]+ar[j]+ar[k] == 0)
					{
						List<Integer> triplet = new ArrayList<Integer>();
						triplet.add(ar[i]);
						triplet.add(ar[j]);
						triplet.add(ar[k]);
						Collections.sort(triplet);
						if(!res.contains(triplet))
							res.add(triplet);
					}
				}
			}
		}
		System.out.println("Following your distinct triplets");
		System.out.println(res);//.toString());
	}
}