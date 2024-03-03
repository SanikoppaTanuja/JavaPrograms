package programs;

public class Totalcharacters {

	public static void main(String[] args) {
		
		String name="tanja sanikoppa";
		int count=0;
		
		for(int i=0; i<name.length(); i++)
	{
		System.out.println(name.charAt(i));
		//if(name.charAt(i)!=' ')
		{
			count++;
		}
	}
		System.out.println(count);

	}

}
