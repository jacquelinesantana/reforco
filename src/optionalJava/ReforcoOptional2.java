package optionalJava;

import java.util.Optional;

public class ReforcoOptional2 {
	
	//orElse--
	public static String getTesteOrelse() {
		return "Testando o orElse";
	}	
	
	public static void main(String args[])
	{
		
		String teste = (String) Optional.empty()
					  .orElse(getTesteOrelse());
		System.out.println(teste);
	}
}
