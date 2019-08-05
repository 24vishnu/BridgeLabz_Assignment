import java.util.*;
class PointsDistance
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of first point");
		int x = scan.nextInt();
		System.out.println("Enter the value of Second point");
		int y = scan.nextInt();
		System.out.println("Following the distace from origin points (0 ,0)");
		System.out.println((int)Math.sqrt(x*x + y*y));
	}
}