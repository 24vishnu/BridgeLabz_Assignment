import java.io.*;
import java.util.*;

class MyList
{
	Node head;

//create the class of list..
	class Node
	{
		String word;
		Node next;
		Node()		//constructor of Node class with a parameter for data field
		{
			// head = null;
		}
		Node(String data)
		{
			this.word = data;
		}
	}
	

// following is the add functon for my list;
	public void add(String data)
	{
		/*
		Node new_node = new Node();
		new_node.word = data;
		new_node.next = null;
		*/
		Node new_node = new Node(data);
		new_node.next = null;
		Node temp = head;
		while(temp->next != null)
			temp = temp.next;
		temp.next = new_node;
	}

// create a function for remove item from list
	public void remove(String item)
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("List is empty ");
			return;
		}
		//Call the searching function data is present or not in the list
		if(head.data == item)
		{
			head = head.next;
			return;
		}
		while(temp.next != null)
		{
			if(temp.next.data == item)
			{
				Node temp1 = temp.next.next;
				temp.next = temp1;
				return;
			}
		}
	}
// create a searching function for list
	public boolean searchItem(String item)
	{
		Node temp = head;
		if(head == null)
			return false;

		while(temp != null)
		{
			if(temp.data == item)
				return true;
		}
		return false;
	}

// create a function to check list is empty or not
	public boolean isEmplty()
	{
		return (head == null);
	}	
//create a function to get the size of list
	public int size()
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
// create a function to get index of item
	public int index(String item)
	{
		int ind = -1;
		if(searchItem(item) == false)
			return ind;
		Node temp = head;
		while(temp.next != null)
		{
			ind++;
			if(temp.data == item)
				break;
			temp = temp.nxet;
		}
		return ind;
	}
//create pop() function for remove last item and return that item
	public String pop()
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
			return temp.data;
		}
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		String data = temp.next.data;
		temp.next = null;
		return data;
	}

//create a function name pop(pos) emove a item from given postion and return that item
	public String pop(int pos)
	{
		int index = pos;
		if(head.size() < pos)
		{
			System.out.println("postion not present in list (list size is less than given postion)");
			System.exit(0);
		}
		{
			String item;
			Node temp = head;
			while(pos > 0){
				temp = temp.next;
				pos--;
			}
			item = temp.data;
			removePos(index, item);
			return item;
		}
	}
// create a function for insert item at a specifict position
	public void insertPos(int pos, String item)
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

}
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

	/*	 File f=new File("demo.txt");
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
	*/

	}
}