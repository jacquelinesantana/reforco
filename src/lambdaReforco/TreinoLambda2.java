package lambdaReforco;

import java.util.Arrays;
import java.util.List;

public class TreinoLambda2 {
	public static void main(String args[]) {
		//exemplo sem o Lambda
		System.out.println("Lista1 de números listada sem Lambda");
		
		//criei uma lista com numeros
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//for joga os valores do list na variavel n e escreve no console com o system.out
		for(Integer n: list) { System.out.println(n); }
		
		//Mesmo exemplo com Lambda
		System.out.println("Imprime todos os elementos da lista2!");
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
		list2.forEach(n-> System.out.println(n));
		//o forEach escreve no console o conteúdo de List2
		
		
		System.out.println("Imprime os numeros pares da lista!");
		List<Integer> astolfo = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		astolfo.forEach(n -> {
			if(n % 2 == 0) {
				System.out.println(n);
			}

		});
		//a lista astolfo tem valores que são lidos dentro do foreach e só exibe se atender o critério do if
	}
}
