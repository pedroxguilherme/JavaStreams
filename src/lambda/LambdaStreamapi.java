package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaStreamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// STREAM - FLUXO DE DADOS
		
		//API STREAM
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 7, 8, 9, 9, 10, 1);
		
		for(Integer c : list) {
			System.out.println(c);
		}
		System.out.println("/////////////");
		
		// Com Api stream
		list.stream()
		.forEach(c -> System.out.println(c));
		System.out.println("///////////////////////");
	
		
		list.stream()
		.filter(e -> e % 2 == 0)
		.forEach(e -> System.out.println(e));
		
		System.out.println("///////////////////////");
		System.out.println("OPERAÇÕES INTEMERDIARIAS");
		
		list.stream()
		//.sorted() ordena utilizando a ordem natural dos elementos
		.skip(1) //Pula 1 no exemplo
		.limit(6) // limita os 6 primeiros elementos depois do SKIP
		.distinct() // não deixa imprimir numeros iguais
		.filter(e -> e % 2 == 0) // filtro mais personalizado
		.map(e -> e * 2) // muda valores da lista na STREAM
		.forEach(e -> System.out.println(e));
		System.out.println("///////////////////////");
		System.out.println("OPERAÇÕES FINAIS");
		
		Optional<Integer> max = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
			.max(Comparator.naturalOrder());
			System.out.println(max);
			
		Optional<Integer> min = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
			.min(Comparator.naturalOrder());
			 System.out.println(min);
			 
		long count = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
		.count();
		System.out.println(count);
			
		
		String collect = list.stream()
		.map(e-> String.valueOf(e))
		.collect(Collectors.joining());
		System.out.println(collect);
		
		List<Integer> listaArm = list.stream()
		.filter(e-> e % 2 == 0)
		.collect(Collectors.toList());
		System.out.println(listaArm);
			
		Map<Integer, List<Integer>> mapa = list.stream()
		.collect(Collectors.groupingBy(e -> e % 3));
		System.out.println(mapa);
		
		
		
	}

}
