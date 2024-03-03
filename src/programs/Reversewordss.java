package programs;

public class Reversewordss {

	public static void main(String[] args) {
		
		
		String name="my name is tanuja s";
		String words[]=name.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(" " +words[i]);
		}

	}

}
