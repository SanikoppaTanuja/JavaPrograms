package programs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicates {

	public static void main(String[] args) {
		
		String name="Sammu";
		Set<Character> set=new LinkedHashSet();
		for(int i=0; i<name.length(); i++)
		{
			set.add(name.charAt(i));
		}
		System.out.println(set);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
			}
		

	}

}
