
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Leia um valor de ponto flutuante com duas casas decimais. Este valor
		 * representa um valor monetário. A seguir, calcule o menor número de notas e
		 * moedas possíveis no qual o valor pode ser decomposto. As notas consideradas
		 * são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10,
		 * 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
		 * 
		 * Entrada O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤
		 * 1000000.00).
		 * 
		 * Saída Imprima a quantidade mínima de notas e moedas necessárias para trocar o
		 * valor inicial, conforme exemplo fornecido.
		 * 
		 * Obs: Utilize ponto (.) para separar a parte decimal.
		 */

		double valor_monetario;
		int valor_inteiro, resto = 0 ;

		valor_monetario = sc.nextDouble();

		valor_inteiro = (int) valor_monetario / 100;
		resto = (int)valor_monetario % 100;
		System.out.println("vou usar: " + valor_inteiro + " notas de 100 reais");

		valor_inteiro =  resto / 50;
		resto = resto % 50;
		System.out.println("vou usar: " + valor_inteiro + " notas de 50 reais");

		valor_inteiro = resto / 20;
		resto = resto % 20;
		System.out.println("vou usar: " + valor_inteiro + " notas de 20 reais");

		valor_inteiro = resto / 10;
		resto = resto % 10;
		System.out.println("vou usar: " + valor_inteiro + " notas de 10 reais");

		valor_inteiro =  resto / 5;
		resto = resto % 5;
		System.out.println("vou usar: " + valor_inteiro + " notas de 5 reais");

		valor_inteiro = resto / 2;
		resto = resto % 2;
		System.out.println("vou usar: " + valor_inteiro + " notas de 2 reais");

		valor_inteiro = resto / 1;
		resto = resto % 1;
		System.out.println("vou usar: " + valor_inteiro + " moedas de 1 reais");

		resto = resto * 100;
		valor_inteiro =  resto / 50;
		resto = resto % 5;
		System.out.printf("vou usar: %d moedas de 50 centavos%n", valor_inteiro);
        
		
		resto = resto * 100;
		valor_inteiro = resto / 25;
		resto = resto % 25;
		System.out.printf("vou usar: %d moedas de 25 centavos%n", valor_inteiro); 
				
		resto = resto * 100;
		valor_inteiro = resto / 10;
		resto = resto % 10;
		System.out.printf("vou usar: %d moedas de 10 centavos%n", valor_inteiro);

		resto = resto * 100;
		valor_inteiro = resto / 5;
		resto = resto % 5;
		System.out.printf("vou usar:  %d moedas de 5 centavos%n", valor_inteiro);

		resto = resto * 100;
		valor_inteiro = resto / 1;
		resto = resto % 1;
		System.out.printf("vou usar: %d moedas de 1 centavos%n", valor_inteiro);
	}
}
