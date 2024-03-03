package programs;

public class Frequencyofwords6 {

	public static void main(String[] args) {

		
		String fullname="Tanuja s Sanikoppa Tanuja tanuja";
		String[] words=fullname.split(" ");
		int freq[]=new int[fullname.length()-1];
		
		for(int i=0; i<words.length; i++)
		{
			freq[i]=1;
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					freq[i]++;
					
					words[j]="0";
				}
			}
		}
		for(int i=0; i<freq.length; i++)
		{
			if(words[i]!=" " && words[i]!="0")
			{
				System.out.println(" "+words[i]+" " +freq[i]);
			}
		}
		

	}

}
