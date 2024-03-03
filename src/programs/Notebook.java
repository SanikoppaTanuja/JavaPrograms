package programs;

public class Notebook extends Books{

	int pages=60;
	public void displayprice()
	
	{	
		System.out.println(super.pages);
		System.out.println(this.pages);
		
		System.out.println(super.displayprice())
		System.out.println(" book price is");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		Books b=new Books();
		b.displayprice();
		Notebook n=new Notebook();
		n.displayprice();
	}

}
