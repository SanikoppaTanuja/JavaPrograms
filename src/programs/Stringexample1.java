package programs;

public class Stringexample1 {

	public static void main(String[] args) {
		
		String s="tanuja sanikoppa";
		/*for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}*/
		
		
		/*StringBuffer sb=new StringBuffer(s);
		
		System.out.println(sb.reverse())*/;
		
		
		/*char[] ch=s.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}*/
		
		
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
	
		
	

	}

}
