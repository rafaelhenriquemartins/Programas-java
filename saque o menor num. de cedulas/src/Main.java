import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
		 * (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
		 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
		 * necessárias.
		 * 
		 * Entrada O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
		 * 
		 * Saída Imprima o valor lido e, em seguida, a quantidade mínima de notas de
		 * cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir
		 * o fim de linha após cada linha, caso ontrário seu programa apresentará a
		 * mensagem: “Presentation Error”.
		 */

		int valor_digitado, valor_da_nota, qtd_de_notas, resto_da_divisao_digtado_nota;

		System.out.println("digite o valor da nota: ");
		valor_digitado = sc.nextInt();

		valor_da_nota = 100;
		qtd_de_notas = valor_digitado / valor_da_nota;
		System.out.println(qtd_de_notas + " notas de: " + valor_da_nota + " reais");
		resto_da_divisao_digtado_nota = valor_digitado % valor_da_nota;

		valor_da_nota = 50;
		qtd_de_notas = resto_da_divisao_digtado_nota / valor_da_nota;
		System.out.println(qtd_de_notas + " notas de: " + valor_da_nota + " reais");
		resto_da_divisao_digtado_nota = resto_da_divisao_digtado_nota % valor_da_nota;

		valor_da_nota = 20;
		qtd_de_notas = resto_da_divisao_digtado_nota / valor_da_nota;
		System.out.println(qtd_de_notas + " notas de: " + valor_da_nota + " reais");
		resto_da_divisao_digtado_nota = resto_da_divisao_digtado_nota % valor_da_nota;
		
		valor_da_nota = 10;
		qtd_de_notas = resto_da_divisao_digtado_nota / valor_da_nota;
		System.out.println(qtd_de_notas + " notas de: " + valor_da_nota + " reais");
		resto_da_divisao_digtado_nota = resto_da_divisao_digtado_nota % valor_da_nota;
		
		valor_da_nota = 5;
		qtd_de_notas = resto_da_divisao_digtado_nota / valor_da_nota;
		System.out.println(qtd_de_notas + " notas de: " + valor_da_nota + " reais");
		resto_da_divisao_digtado_nota = resto_da_divisao_digtado_nota % valor_da_nota;
		
		valor_da_nota = 2;
		qtd_de_notas = resto_da_divisao_digtado_nota / valor_da_nota;
		System.out.println(qtd_de_notas + " notas de: " + valor_da_nota + " reais");
		resto_da_divisao_digtado_nota = resto_da_divisao_digtado_nota % valor_da_nota;
		
		valor_da_nota = 1;
		qtd_de_notas = resto_da_divisao_digtado_nota / valor_da_nota;
		System.out.println(qtd_de_notas + " moeda: " + valor_da_nota + " real");
		resto_da_divisao_digtado_nota = resto_da_divisao_digtado_nota % valor_da_nota;
		
	}

}
