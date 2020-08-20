package principal;

import java.util.Scanner;

import employes.Employes;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Employes nome, salario, taxa;
		Employes employes = new Employes();
		
		System.out.println("digite o nome ");
		employes.name = sc.next();
		System.out.println("digite o salario ");
		employes.grossSalary = sc.nextDouble();
		System.out.println("digite a taxa ");
		employes.tax = sc.nextDouble();
		
		System.out.println("entrada " + employes);
		System.out.println();
		
		System.out.println("Emploues: " + employes.netSalary());
		System.out.println();
		
		System.out.println("digite a a porcentagem ");
		double taxa =sc.nextDouble();
		System.out.println("porcentagem: " + taxa);
		
		
		employes.increaseSalary(taxa);
		
		
	}

}
