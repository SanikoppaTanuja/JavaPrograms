package programs;

public class Occuranceprogram {

	public static void main(String[] args) {
	
		String name="tanuja sankoppa";
		int[] frequency=new int[name.length()];
		int i, j;
		
	char[] chars=name.toCharArray();
	for( i=0; i<chars.length; i++)
	{
		frequency[i]=1;
		for(j=i+1; j<chars.length; j++)
		{
			if(chars[i]==chars[j])
			{
			frequency[i]++;
			chars[j]='0';
			}
		}
	}
	
	for(i=0; i<frequency.length; i++)
	{
		if(chars[i]!='0' && chars[i]==' ')
		
			System.out.print(chars[i]+"------"+frequency[i]);
		
	}
	
		
		
		}

}
