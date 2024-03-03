package programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Javaprogramm {

	public static void main(String[] args) {
		
		String str="aaabbcddo";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(char ch:str.toCharArray())
		{
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}
			for(Entry<Character, Integer> entry:map.entrySet())
			{
				if(entry.getValue()==1);
				{
					System.out.print(entry.getKey()+"--"+" " +entry.getValue()+" ");
					break;
				}
			}
			
		}
		
		
		
	

	}


