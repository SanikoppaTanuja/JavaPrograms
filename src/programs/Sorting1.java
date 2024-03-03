package programs;

import java.util.Arrays;

public class Sorting1 {

	public static void main(String[] args) {
		
		
		String name="tanuja";
		char[] narray=name.toCharArray();
		
		for(int i=0; i<narray.length; i++)
		{
		Arrays.sort(narray);
		}
		
		System.out.println(narray);

	}

}
