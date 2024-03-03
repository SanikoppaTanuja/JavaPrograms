package programs;

import java.util.Arrays;

public class Anagramex {

	public static void main(String[] args) {
		
		String s1="abcdh";
		String s2="cbda";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("strings are no anagram");
		}
		else
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
			System.out.println("strings are  anagram");
			}
			else
			{
				System.out.println("strings are no anagram");
			}
		}
		
		
		
				

	}

}
