package programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Norepatinchar {

	public static void main(String[] args) {
		
		String input="aabbccfd";
		Map <Character, Integer> map=new LinkedHashMap();
		for(int i=0; i<input.length(); i++)
		{
			char ch=input.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);
		for(Entry<Character, Integer> entrySet:map.entrySet())
		{
			if(entrySet.getValue()==1)
			{
				System.out.println(entrySet.getKey());
				break;
			}
		}
		

	}

}
