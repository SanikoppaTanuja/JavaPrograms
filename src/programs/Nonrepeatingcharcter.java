package programs;

public class Nonrepeatingcharcter {

	public static void main(String[] args) {
		
		String input="aaccddfrrss";
		
		for(int i=0; i<input.length(); i++)
		{
			boolean unique=true;
			for(int j=0; j<input.length(); j++)
			{
				if(i!=j && input.charAt(i)==input.charAt(j))
				{
					unique=false;
					break;
					
				}
			}
			if(unique)
			{
				System.out.println("first non repaeting character is  "  +input.charAt(i));
				break;
			}
		}
		

	}

}
