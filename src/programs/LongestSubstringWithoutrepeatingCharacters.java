package programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutrepeatingCharacters {

		public static void main(String[] args)
		{
			
			Lengthoflongestsubstring("abbac");
		}

		public static void Lengthoflongestsubstring(String s) {
		
			String longestsubstring=null;
			int LongestSubStringLength=0;
			Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
			char[] arr=s.toCharArray();
			for(int i=0; i<arr.length; i++)
			{
				char ch=arr[i];
				if(!map.containsKey(ch))
				{
					map.put(ch,  i);
					
				}else
				{
					i=map.get(ch);
					map.clear();
				}
			if(map.size()>LongestSubStringLength)
			{
				
				LongestSubStringLength=map.size();
			longestsubstring=map.keySet().toString();
			}
			}
			
			System.out.println("longest substring is" + longestsubstring);
			System.out.println("length of longest substring is"+ LongestSubStringLength);
		}
		

	}


