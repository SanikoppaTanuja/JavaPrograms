package programs;

public class Uppertolower {

	public static void main(String[] args) {
	
		
		
		String name="Tanuja sanikoppa";
		
		StringBuffer sb=new StringBuffer(name);
		for(int i=0; i<name.length(); i++ )
		{
			char ch=name.charAt(i);
			if(Character.isLowerCase(ch))
			{
				ch=Character.toUpperCase(ch);
				sb.setCharAt(i, ch);
			}
			
			else if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
				sb.setCharAt(i, ch);
			}
		}
		System.out.println(sb);
		
		

	}

}
