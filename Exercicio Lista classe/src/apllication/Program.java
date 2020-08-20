package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("digite quantos funcionario ira cadastrar");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(" digite o id");
			int id = sc.nextInt();
			
			while(hasId (list, id)) {
				System.out.println(" ID JA EXIXTE, digite o id");
			    id = sc.nextInt();
								
			}
			
			System.out.println(" digite o nome");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println(" digite o salario");
			double salary = sc.nextDouble();
			list.add(new Funcionario(id, name, salary));
			System.out.println("funcionario: " + i + list);
		}

		for(Funcionario obj : list) {
		System.out.println(obj);
		}
		
		
		sc.close();

	}

	private static boolean hasId(List<Funcionario> list, int id) {
		Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}

}
