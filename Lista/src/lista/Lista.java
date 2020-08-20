package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("Victor");
		list.add("Martins");
		list.add(2, "gomes");
		list.add("Amarildo");
		list.add("Adolfo");
		
		
		for (String i : list) {
			System.out.println("Nome: " + i);
		}
		
		System.out.println(list.size());
		System.out.println("-----------------------------------");
		
		list.remove("Maria");
		
		for (String i : list) {
			System.out.println("Nome: " + i);
		}
		System.out.println("-----------------------------------");
		
		list.remove(1);
		//list.removeIf(x -> x.charAt(0) == 'M');//todo string x tal que x.charAt(0) == 'M'
		//remove se a string na posição 0 for igual a m
		
		
		//achar a posicao de um elemento
		System.out.println(" index of Joao: " + list.indexOf("Martins"));
		
		for (String i : list) {
			System.out.println("Nome: " + i);
		}
		//filtrar a lista com todos que comecam com A
		//fazer uma nova lista, para que ela entre na minhha lista entiga e faça uma nova lista com os novos nomes.
		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//primeiro converto ele pra stream
		//faço a operacao lambda filter(x -> x.charAt(0) == 'A')
		// volto ele pra lista collect(Collectors.toList());
		
		
		System.out.println("-----------------------------------");
		
		for (String i : resultado) {
			System.out.println("Nome: " + i);
		}
		
		System.out.println("-----------------------------------");
		// retorna o primeiro elemento que atende minha requisição
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
		
		
		
	}

}
