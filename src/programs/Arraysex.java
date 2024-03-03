package programs;

import java.util.Arrays;

public class Arraysex {

	public static void main(String[] args) {
		
		
		int[] array=new int[] {34, 56, 90, 78};
		Arrays.sort(array);
		System.out.println("Elements in asceneding order");
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
}
}
