package programs;

public class Priningduplicatevalues {

	public static void main(String[] args) {

		int a[]= {2,3, 5, 3, 2, 5, 5, 2};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
