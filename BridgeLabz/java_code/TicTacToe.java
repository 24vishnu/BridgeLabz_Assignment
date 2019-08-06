import java.util.*;
class TicTacToe
{
	String user1 = "Player1";
	String user2 = "Player2";
	char choice1 = 'O';
	char choice2 = 'X';
	// char [][] TicTac = new char[3][3];
	char [][] TicTac = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};

	TicTacToe(String name1,char ch1,String name2, char ch2)
	{
		this.user1 = name1;
		this.choice1 = ch1;
		this.user2 = name2;
		this.choice2 = ch2;
	}
	TicTacToe(String name1,char ch1, char ch2)
	{
		this.user1 = name1;
		this.choice1 = ch1;
		this.user2 = "System";
		this.choice2 = ch2;
	}

	public void player1()
	{
		System.out.println("Now "+user1+" turn ");
		System.out.println("Where you want to put "+choice1+" in game (Enter x,y position)");
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		if(TicTac[x1][y1] == '-'){
			TicTac[x1][y1] = choice1;
			display();
			if(winner(choice1) == true)
			{
				System.out.println("Congratulations.. "+user1+"! You are winner");
				System.exit(0);
			}
		}else
		{
			System.out.println("Sorry..! "+user1+" This place Allready selected.. please chose empty place");
			player1();
		}
		System.out.println("Now "+user2+" turn \n");		
	}

	public void systemPlayer()
	{
			Random r = new Random();
			int x2 = r.nextInt(3);
			int y2 = r.nextInt(3);
			if(TicTac[x2][y2] == '-'){
				System.out.println(x2+" "+y2);
				TicTac[x2][y2] = choice2;
				display();
				if(winner(choice2) == true)
				{
					System.out.println("Sorry.. "+user1+"! You loss");
					System.exit(0);
				}
			}else
			{
				systemPlayer();
			}
	}

	public void player2()
	{
		System.out.println("Now "+user2+" turn ");
		System.out.println("Where you want to put "+choice2+" in game (Enter x,y position)");
		Scanner scan = new Scanner(System.in);
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		if(TicTac[x2][y2] == '-'){
			TicTac[x2][y2] = choice2;
			display();
			if(winner(choice2) == true)
			{
				System.out.println("Congratulations.. "+user2+"! You are winner");
				System.exit(0);
			}
		}else
		{
			System.out.println("Sorry..! "+user2+" This place Allready selected.. please chose empty place");
			player2();
		}
	}
	boolean winner(char ch)
	{
		// [0 0 0]
		// [1 1 1]
		// [2 2 2]
		for(int i = 0; i < 3; i++)
		{
			int count = 0;
			for(int j = 0; j < 3; j++)
			{
				if(TicTac[i][j] == ch)
				{
					count++;
				}else
				{
					break;
				}
			}
			if(count == 3)
				return true;
		}
		for(int i = 0; i < 3; i++)
		{
			int count = 0;
			for(int j = 0; j < 3; j++)
			{
				if(TicTac[j][i] == ch)
				{
					count++;
				}else
				{
					break;
				}
			}
			if(count == 3)
				return true;
		}
		for(int i = 0; i < 3; i++)
		{
			int count = 0;
			for(int j = 0; j < 3; j++)
			{
				if(i == j || (i+j) == 2)
				if(TicTac[i][j] == ch)
				{
					count++;
				}else
				{
					break;
				}
			}
			if(count == 3)
				return true;
		}
		return false;
	}
	void display(){
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
				System.out.print(TicTac[i][j]+" ");
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String p1, p2;
		char ch1, ch2;
		
		char twoPlayer;
		System.out.println("Do you want to play with System (y/n):");
		twoPlayer = scan.nextLine().charAt(0);
		TicTacToe obj;
		if(twoPlayer == 'n' || twoPlayer == 'N')
		{
			System.out.println("Enter name of player1 : ");
			p1 = scan.nextLine();
			System.out.println("Enter choice of player1 (O/X): ");
			ch1 = scan.nextLine().charAt(0);

			System.out.println("Enter name of player2 : ");
			p2 = scan.nextLine();
			ch2 = (ch1 == 'O'?'X':'O');

			obj = new TicTacToe(p1,ch1,p2,ch2);
			for(int i = 0; i < 9; i++)
			{
				if(i%2 == 0)
					obj.player1();
				else
					obj.player2();
			}
		}
		else
		{
		System.out.println("Enter name of player1 : ");
		p1 = scan.nextLine();
		System.out.println("Enter choice of player1 (O/X): ");
		ch1 = scan.nextLine().charAt(0);
		ch2 = (ch1 == 'O'?'X':'O');
			obj = new TicTacToe(p1,ch1,ch2);
			for(int i = 0; i < 9; i++)
			{
				if(i%2 == 0)
					obj.player1();
				else
					obj.systemPlayer();
			}
		}

		
		System.out.println("This game is Tie.. No one is win");
	}
}