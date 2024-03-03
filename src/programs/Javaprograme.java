package programs;

public class Javaprograme {

	public static void main(String[] args) {
		
		int[] originalArray=new int[]{1,2,3,4,5};
		int removeelement=5;
		int[] newArray=new int[originalArray.length-1];
		int index=0;
		for(int i=0; i<originalArray.length; i++)
		{
			if(originalArray[i]!=removeelement)
			{
				newArray[index]=originalArray[i];
				index++;
			}
		}
		for(int i=0; i<newArray.length; i++)
		{
		System.out.println(newArray[i]);
		}
		}
}


