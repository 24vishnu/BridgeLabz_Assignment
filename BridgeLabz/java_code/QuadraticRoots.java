import java.util.*;

class QuadraticRoots
{
	public void rootFunction(double a, double b, double c)
	{
		double root1;
		double root2;

		double delta = (b*b - 4*a*c);
		if(delta > 0){
			root1 = (-b + Math.sqrt(delta))/(2*a);
			root2 = (-b - Math.sqrt(delta))/(2*a);
			// System.out.println("Root one : "+root1+"\nRoot two : "+root2);
			System.out.format("Root one : %.2f \nRoot two : %.2f \n",root1,root2);

		}else if(delta == 0)
		{
			root1 = root2 = (-b /(2 * a));
			// System.out.println("Root one : "+root1+"\nRoot two : "+root2+" are equal");
			System.out.format("Equal roots \nRoot one : %.2f \nRoot two : %.2f \n",root1,root2);

		}else
		{
			root1 = (-b /(2*a));
			root2 = (Math.sqrt(-1 * delta))/(2*a);
			// System.out.println("Root one (real and imagnary root): "+root1+"-"+root2+"i"+"\nRoot two (real and imagnary root): "+root1+"-"+root2+"i");
			System.out.format("Root one (real and imagnary root): %.2f + %.2fi \nRoot two (real and imagnary root): %.2f - %.2fi \n",root1,root2,root1,root2);

		}
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a, b and c for find the root of Quadratic equation");
		double a,b,c;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		QuadraticRoots qr = new QuadraticRoots();
		qr.rootFunction(a,b,c);
	}
}
