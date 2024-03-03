package programs;

import java.util.HashMap;
import java.util.Map;

public class Stringprogram {

	public static void main(String[] args) {
		
		String msg="Hi Hi This is Tanuja THIS Hi";
		msg=msg.toLowerCase();

		String[] words=msg.split(" ");
		
		
		Map<String, Integer> map=new HashMap();
		
		for(String word:words)
		{
			if(!map.containsKey(word))
			{
				map.put(word, 1);
			}
			else
			{
				int value=map.get(word);
				map.put(word, value+1);
			}
		}
		System.out.println(map);
	}
}
		 
	


