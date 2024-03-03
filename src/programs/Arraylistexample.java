package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample {

	public static void main(String[] args) {
		
		ArrayList<String> list=new  ArrayList<String>();
		list.add("tanuja");
		list.add("Shilpa");
		list.add("Prema");
		list.add("Shweta");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
 		

	}

}
