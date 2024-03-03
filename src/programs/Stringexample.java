package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Stringexample {

	public static void main(String[] args) {
	
		
		String name="tanuja";
		
		
		Set<Character> set=new LinkedHashSet();
		
		for(int i=0; i<name.length(); i++)
		{
			set.add(name.charAt(i));
		}
	
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
			}
		}

}
