import java.util.Scanner;
class TwoDArray
{

	public static void integer_Functio(int row, int col)
	{
		Scanner scan = new Scanner(System.in);
		int[][] integerArray = new int[row][col];
		System.out.println("Enter the Integer value");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				integerArray[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(integerArray[i][j]+" ");
			}
			System.out.println();			
		}
	}
	public static void double_Functio(int row, int col)
	{
		double[] []doubleArray = new double[row][col];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the IDouble value");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				doubleArray[i][j] = scan.nextDouble();
			}
		}
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(doubleArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void boolean_Functio(int row, int col)
	{
		boolean [] [] booleanArray = new boolean[row][col];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the true or false value");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				booleanArray[i][j] = scan.nextBoolean();
			}
		}
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(booleanArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the value of row and column for 2 D array");
				int row = scan.nextInt();
				int col = scan.nextInt();			

		System.out.println("Enter your choice\n1.	For Integer array\n2.	For Double array \n3.	For Boolean array");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			integer_Functio(row,col);
		}else if(choice == 2)
		{
			double_Functio(row, col);
		}else if(choice == 3)
		{
			boolean_Functio(row, col);
		}else
		{
			System.out.println("You Entered wrong choice");
		}
	}
}