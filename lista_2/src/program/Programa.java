package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lista.Lista;

public class Programa {

	public static void main(String[] args) {
		
		List<Lista> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		
		list.add(new Lista(nome, idade));
		
		for (Lista l : list) {
			System.out.println(l.toString());
		}
				
		

	}

}
