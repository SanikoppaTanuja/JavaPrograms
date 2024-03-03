package programs;

import java.util.HashSet;

public class LongestOverallprogram {

	public static void main(String[] args) {
		
		
	String str="abcdabklmnop";
	Longest(str);

	}

	public static void Longest(String str) {
		// TODO Auto-generated method stub
		
		
		HashSet<Character> set=new HashSet<Character>();
			String longestoverall="";
			String longesttillnow="";
			for(int i=0; i<str.length(); i++)
			{
				char ch=str.charAt(i);
				if(set.contains(ch))
				{
					longesttillnow="";
					set.clear();
				}
				set.add(ch);
				longesttillnow+=ch;
				
				if(longesttillnow.length()>longestoverall.length())
				{
					longestoverall=longesttillnow;
				}
			}
	System.out.println(longestoverall.length());
		
	}

}
