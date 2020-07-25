import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e
		 * informe-a em anos, meses e dias
		 * 
		 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo
		 * mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
		 * meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com
		 * objetivo de testar raciocínio matemático simples.
		 * 
		 * Entrada O arquivo de entrada contém um valor inteiro.
		 * 
		 * Saída Imprima a saída conforme exemplo fornecido.
		 */

		int idade, resto1, divisao_de_variaveis;
		
		idade = sc.nextInt();
		
		
		divisao_de_variaveis = idade / 365;
		resto1 = idade % 365;
		System.out.println("resto ano: " + divisao_de_variaveis );
		divisao_de_variaveis = resto1 / 30;
		System.out.println("idade em meses: " + divisao_de_variaveis );
		resto1 = resto1 % 30;
		System.out.println("idade em dias: " + resto1 );
		
	

	}

}
