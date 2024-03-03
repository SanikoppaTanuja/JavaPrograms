package programs;

public class minandmaxoccuranceprogram {

	public static void main(String[] args) {
		
		
		  String str = "grass is greener on the other side";
		 
		  int[] freq=new int[str.length()];
		  
		  int i, j, min, max;
		
		  
		  char[] ch=str.toCharArray();
		  char minchar=str.charAt(0);
		  char maxchar=str.charAt(0);
		  
		  
		  for(i=0; i<ch.length; i++ )
		  {
			  freq[i]=1;
			  {
				  for(j=i+1; j<ch.length; j++)
				  {
					  if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0')
					  {
						  freq[i]++;
						  
						  ch[j]='0';
					  }
				  }
			  }
		  }
		  min=max=freq[0];
		  for(i=0; i<freq.length; i++)
		  {
			 if(min>freq[i])
			 {
				 
				 min=freq[i];
			 
			  minchar=ch[i];
		  }
			 
			 if(max<freq[i])
			 {
				 max=freq[i];
				 maxchar=ch[i];
				 }
			 }
		  System.out.println(minchar);
		  System.out.println(maxchar);
		  
			  
		  }
	      


	}
