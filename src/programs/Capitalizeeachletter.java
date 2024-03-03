package programs;

public class Capitalizeeachletter {

	public static void main(String[] args) {
		
			String name=" my name is tanuja";
			
			String emptystring="";
			
			
			for(int i=0; i<name.length(); i++)
			{
				char ch=name.charAt(i);
				if(ch==' ')
				{
					emptystring=emptystring+ch;
					i++;
					ch=name.charAt(i);
					if(Character.isLowerCase(ch))
					{
						ch=Character.toUpperCase(ch);
						emptystring=emptystring+ch;	
						
					}
				}
				else
				{
					emptystring=emptystring+ch;	
				}
					
					
					
				}
			System.out.println(emptystring.trim());
				
			}

	}


