package programs;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="tanuja";
		char[] chararray=name.toCharArray();
		char temp;
		
		for(int i=0; i<chararray.length; i++)
		{
			for(int j=i+1; j<chararray.length; j++)
			{
				if(chararray[i]>chararray[j])
				{
					temp=chararray[i];
					chararray[i]=chararray[j];
					chararray[j]=temp;
				}
			}
		}
		
		System.out.println(new String(chararray));

	}

}
