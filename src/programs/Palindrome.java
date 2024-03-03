package programs;

public class Palindrome {

	public static void main(String[] args) {
	
		String name="kayAk";
		String reverse="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			reverse=reverse+name.charAt(i);
		}
		
		if(reverse.equalsIgnoreCase(name))
		{
			System.out.println("Strings are palndrome");
		}
		else
		{
			System.out.println("strings are not palindrome");
		}
	}

}
