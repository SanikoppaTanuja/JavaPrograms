package programs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="tanuja";
		
		Set<Character> set=new LinkedHashSet<Character>();
		
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
		
		name.chars().distinct().forEach(null);

	}

}
