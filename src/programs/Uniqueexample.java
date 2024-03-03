package programs;

public class Uniqueexample {
	
	public static void main(String[] args)
	
	{
		String input="aacghabbb";
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
		System.out.println(input.charAt(i));
		break;
		}
	}
	}
	
	

}
