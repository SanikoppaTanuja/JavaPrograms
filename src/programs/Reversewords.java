package programs;

public class Reversewords {

	public static void main(String[] args) {
		
		
	String msg="hi, Ths is Tanuja";
	String[] words=msg.split(" ");
	for(int i=words.length-1; i>=0; i--)
	{
		System.out.print(" " +words[i]);
	}

	}

}
