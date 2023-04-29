package lambda;

import java.util.Optional;

public class OptionalJava {

	public static void main(String[] args) {

// OPTIONAL USAR APENAS EM RETORNO DE FUNÇÕES
// NÃO USAR EM ARGUMENTOS		
		
		//String s = "Alo";
		String s = "1";
		//Optional<Integer> numero = converteNumero(s); INCIALIZAÇÃO PADRÃO
		//System.out.println(numero.get()); PEGAR NUMERO 
		//System.out.println(numero.isPresent()); ESTÁ PRESENTE
		//numero.ifPresent(n -> System.out.println(n)); SE ESTIVER PRESENTE APRESENTA
		converteNumero(s).ifPresent(n -> System.out.println(n));
		// .orElse(2) CASO NAO RETORNAR VALOR, VAI RETORNAR 2// DA PRA USAR LAMBDA
		//.orThrow(() -> new NullPointerException() ) LANÇA UMA EXCEÇÃO
		
		

	}

	private static Optional<Integer> converteNumero(String s) {
	
		try {
		Integer integer = Integer.valueOf(s);
		return Optional.of(integer);
		}catch(Exception e){
			return Optional.empty();
		}
		
		
	
	}

}
