 package ListPackage;

import java.io.*;
import java.util.*;

class MyUnorderedList <T /*extends Object*/>
{
	Node head;

//create the class of list..
	class Node
	{
		T word;
		Node next;

		// Node()
		// {
		
		// }
	} 
	
// following is the add functon for my list;
	public void add(/*String*/T data)
	{
		Node new_node = new Node(/*data*/);
		new_node.word = data;
		new_node.next = null;
		if(head == null)
		{
			head = new_node;
			return;
		}
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = new_node;
	}


// create a function for remove item from list
	public void remove(/*String*/T item)
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("List is empty ");
			return;
		}
		if(searchItem(item) == false)
		{
			System.out.println(item+" not present in list");
			return;
		}
		//Call the searching function data is present or not in the list
		if(head.word.equals(item))
		{
			head = head.next;
			System.out.println(item+" Removed ");		
			return;
		}
		while(temp.next != null)
		{
			if(temp.next.word.equals(item))
			{
				Node temp1 = temp.next.next;
				temp.next = temp1;
				System.out.println(item+" Removed ");
				return;
			}
			temp = temp.next;
		}
	}
	// // create a searching function for list
	public boolean searchItem(/*String*/T item)
	{
		Node temp = head;
		if(temp == null)
			return false;

		while(temp != null)
		{
			if(temp.word.equals(item)){
				return true;
			}
			temp = temp.next;
		}

		return false;
	}
	// // create a function to check list is empty or not
	public boolean isEmplty()
	{
		return (head == null);
	}	
	// //create a function to get the size of list
	public Integer size()
	{
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	// // create a function to get index of item
	public /*int*/Integer myIndex(/*String*/T item)
	{

		/*int*/Integer ind = Integer.parseInt("-1");
		if(searchItem(item) == false)
			return ind;
		
		Node temp = head;
		while(temp != null)
		{
			ind++;
			if(temp.word.equals(item)){
				return ind;
				// break;
			}
			temp = temp.next;
		}
		return ind;
	}
	// //create pop() function for remove last item and return that item
	public /*String*/ T pop()
	{
		if(head == null)
		{
			System.out.println("Underflow no item in list");
			System.exit(0);
		}

		Node temp = head;
		if(temp.next == null)
		{
			head = null;
			return temp.word;
		}
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		/*String*/T data = temp.next.word;
		temp.next = null;
		return data;
	}
//create a function name pop(pos) emove a item from given postion and return that item
	public /*String*/T pop(/*int*/Integer pos)
	{
		T item =(T)"null";
		// /*int*/Integer index = (Integer)pos;
		if(size() <= pos)
		{
			System.out.println("postion not present in list (list size is less than given postion)");
			return item;
			// System.exit(0);
		}else{

			/*String*/
			Node temp = head;
			Node temp1 = null;
			if(pos == 0)
			{
				item = head.word;
				head = head.next;
				return item;
			}
			while(pos > 0){
				temp1 = temp;
				temp = temp.next;
				pos--;
			}
			item = temp.word;
			// if(temp.next != null)
			
				temp1.next = temp.next;
			


			// removePos(index, item);
		}
		return item;
	}
	// // create a function for insert item at a specifict position
	public void insertPos(/*int*/Integer pos, /*String*/T item)
	{
		Node new_node = new Node();
		new_node.word = item;
		new_node.next = null;
		if(pos == 0)
		{
			new_node.next = head;
			head = new_node;
		}else{
			Node temp = head;
			while(pos > 1 && temp.next != null)
			{
				temp = temp.next;
				pos--;
			}
			if(temp.next == null)
				temp.next = new_node;
			else{
				Node temp1 = temp.next;
				new_node.next = temp1;
				temp.next = new_node;
			}
		}
	}

//create a function to display list
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.word+"->");
			temp = temp.next;
		}
		System.out.print("null\n");
	}

// Following is main method..
	public static void main(String[] args) 
	{
		MyUnorderedList<Object> list = new MyUnorderedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choise.. \n1.	 create list \n2.	Add item \n3.	remove item \n4.	Check list empty or not \n5.	Find sizeof list \n6.	Find index ot item \n7.	insert item at a given position \n8.	Perform pop() operation to get ans remmove last element of list \n9.	pop(item) get and remove a item from a position \n10	search element in list \n11.	display list");
		

//
		int reply = 1;
		while(reply == 1){
			String item = "";
			/*int*/Integer pos;
			/*int*/Integer choice = Integer.parseInt(scan.nextLine());//scan.nextInt();
			switch(choice)
			{
			case 1:
					list = new MyUnorderedList();						//We can call inner class by using (outerClass.InnerClass innerObject = outerClass.new.InnerClass()
					System.out.println("Your Empty list is created.");
				break;
			case 2:	
					System.out.println("Enter a word (String) for add in list : ");
					item = scan.nextLine();
					list.add(item);
					// System.out.println("Your "+item+" is added in list. See following \n");
					// list.display();
				break;
			case 3:
					System.out.println("Enter a word (String) for remove from list : ");
					item = scan.nextLine();
					list.remove(item);
					// System.out.println("Your "+item+" is successfully removed from list. See following \n");
					list.display();
				break;
			case 4:
					if(list.isEmplty() == true)
					{
						System.out.println("Yes!! list is emplty");
					}else{
						System.out.println("No.. list Not empty.");						
					}
				break;
			case 5:
					// if(list.siz() > 0)
						System.out.println("Curent size of your list is : "+list.size());
				break;
			case 6:
					System.out.println("Enter the word which present in list :");
					item = scan.nextLine();
					if(list.myIndex(item) != -1)
						System.out.println("index of your word is : "+(list.myIndex(item)));
					else
						System.out.println("Sorry!! your word is not present in list. ");
				break;
			case 7:
					System.out.println("Enter a Position (make sure position should be less than size of list): ");
					pos = Integer.parseInt(scan.nextLine());
					System.out.println("Enter a word (String)  : ");
					item = scan.nextLine();
					list.insertPos(pos, item);
					System.out.println("Your "+item+" is successfully add at your given position into list. See following \n");
					list.display();

				break;
			case 8:
					item = (String)list.pop();
					System.out.println("Your last item is "+item+ " and it is removed now");
					list.display();

				break;
			case 9:
					System.out.println("Enter your position : ");
					Integer poss = Integer.parseInt(scan.nextLine());
					item = (String)(list.pop(poss));
					if(!item.equals("null"))
						System.out.println("Last word is "+item+" now this is successfully removed from list. See following \n");
					list.display();
				break;
			case 10:
					System.out.println("Enter a word (String) for search in the list : ");
					item = scan.nextLine();
					if(list.searchItem(item) == true)
					{
						System.out.println("Waoo!! Your word is present in the list");
					}else{
						System.out.println("Sorry !! Your word is not present in the list");						
					}
					// list.display();
				break;
			case 11:
					list.display();
					break;
			default :
				System.out.println("You choose incorrect operation numbner please choose only (1 - 9) number.");
			}
			System.out.println("Enter\t 1 for next choice  \n\t 0 for Exit");
			reply = Integer.parseInt(scan.nextLine());
			System.out.println("Again choose for next operation :");
		}		
	}
}	

/*
	class MyUnOrderedList
	{
	public static void main(String[] args)throws IOException {
		 ArrayList<String> list = new ArrayList<String>();
		 String word = "";

		BufferedReader br1=new BufferedReader(new FileReader("demo.txt"));
		
		while((word = br1.readLine()) != null){
		String [] words = word.split("\\s+");
		for(int i = 0; i < words.length; i++)
			list.add(words[i]);
	}
		System.out.print(list);

		 File f=new File("demo.txt");
		 FileReader fr=new FileReader(f);
		 int i=fr.read();
		 while(i!=-1)
			{
				if((char)i == ','||(char)i == '.'||(char)i == '!'||(char)i == '?'||(char)i == '-'||(char)i == ':')
				{
					i=fr.read();
					continue;
				}
				if((char)i == ' ')
				{
					list.add(word);
					word = "";
				}else
				{
					word += (char)i;
				}
				i=fr.read();
			}
		if(word != "")
			list.add(word);
		System.out.print(list);
	

	}
	}
*/
