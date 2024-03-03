package programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Stringprograms {
	
	public static void main(String[] args)
	{

	
	
	String name="tanuja sanikoppa";
	
	
	
	Map<Character, Integer> map=new LinkedHashMap();
	
	char[] namearray=name.toCharArray();
	
	
	for(char ch:namearray)
	{
		if(!map.containsKey(ch))
		{
			map.put(ch, 1);
			
		}
		else
		{
			int value=map.get(ch);
			map.put(ch, value+1);
		
		}
	
	}
	System.out.println(map);
	}
}

	
	


