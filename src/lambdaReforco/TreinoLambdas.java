package lambdaReforco;

import java.util.Arrays;
import java.util.List;

public class TreinoLambdas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sem o lambda
		System.out.println("Imprime todos os elementos da lista!");
		List<String> list = Arrays.asList("Rita", "Marcia"); 
		for(String n: list) { System.out.println(n); }
		
		
		//com lambda1
		/*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 list.forEach(n-> System.out.println(n));*/
		
		//com lambda2
		//List.of( 6, 7, 8, 9,11,12).forEach(System.out::println);
			
	}
}
