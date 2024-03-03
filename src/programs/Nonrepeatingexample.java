package programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Nonrepeatingexample {

	public static void main(String[] args) {
	
		
		String input="aabcddeefg";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<input.length(); i++)
		{
			char ch=input.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		
		
		for(Entry <Character, Integer> entrySet: map.entrySet())
		{
			if(entrySet.getValue()==1)
			{
				System.out.println(entrySet.getKey());
				break;
				
			}
			
		}
		

	}

}
