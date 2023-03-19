package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaStreamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// STREAM - FLUXO DE DADOS
		
		//API STREAM
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		
		for(Integer c : list) {
			System.out.println(c);
		}
		System.out.println("/////////////");
		
		// Com Api stream
		list.stream()
		.forEach(c -> System.out.println(c));
		System.out.println("///////////////////////");
		// numeros pares
		
		list.stream()
		.filter(e -> e % 2 == 0)
		.forEach(e -> System.out.println(e));
	}

}
