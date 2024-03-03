package programs;

public class Removespaces {

	public static void main(String[] args) {
	
		
		String name="t@#$nuja09";
		name=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(name);

	}

}
