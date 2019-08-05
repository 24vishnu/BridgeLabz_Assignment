import java.util.Scanner;
class HelloUser
{
	public static void main(String[] args) {
		/*
			A simple text scanner which can parse primitive types and strings using regular expressions.
			A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various next methods. 	
		*/
		Scanner scan = new Scanner(System.in);			//Create a Object of scanner class for take input by user
		System.out.println("Please Enter your name : ");//Instruction for user 
		String user_name = scan.nextLine();				//Take user input and store in String valiable name user_name	
		System.out.println("Hello "+user_name);			//Display Hello with entered user name
	}
	
}