package programs;

public class Evenoddnumbers {

	public static void main(String[] args) {
		
		int a[]= {10,8,7,6,3};
		System.out.println("Odd numbers");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("even numbers");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	
		
		
		
		
	

	}

}
