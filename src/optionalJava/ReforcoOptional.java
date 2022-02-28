package optionalJava;

import java.util.Optional;
import java.util.stream.IntStream;

public class ReforcoOptional {

	public static void main(String[] args) {
		
		/* *********** exemplo 1 *************** */
		
		//teste 1 incluir informação e recuperar para exibir na tela
		Optional<String>xz1=Optional.of("Somos todes Devs");
		//seria similiar ao xz1 = "Somos todes Devs";
		
		System.out.println(xz1.get());
		//escreve na tela o que foi recuperado com GET que esta dentro do objeto xz1
		
		
		
		/* *********** exemplo 2 *************** */
		// stream cria a sequencia de numero de 0 a 3 
		// o  map esta multiplicando os elementos por 2 ou seja 0x2,0x1,0x2
		//usamos o IntStream pois o Map é utilizado para manipular objetos do tipo Stream
		IntStream.range(0, 4).map(e -> e * 2).forEach(System.out::println);
		//forEach varre o valor de map e escreve na tela
		
		
		
	}
}