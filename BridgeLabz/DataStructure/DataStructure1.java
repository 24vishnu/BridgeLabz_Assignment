package ListPackage;

import ListPackage.MyUnorderedList;
import java.io.*;
import java.util.*;

class DataStructure1
{
	public static void main(String[] args)throws IOException {
		 MyUnorderedList<Object> list = new MyUnorderedList();
		 String word = "";

	// 	BufferedReader br1=new BufferedReader(new FileReader("demo.txt"));		
	// 	while((word = br1.readLine()) != null){
	// 	String [] words = word.split("\\s+");
	// 	for(int i = 0; i < words.length; i++)
	// 		list.add(words[i]);
	// }
	// System.out.print(list);

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
		System.out.print("Following is data in list\n ");
			list.display();
	

	}
}