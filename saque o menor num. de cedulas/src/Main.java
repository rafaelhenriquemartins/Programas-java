import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis
		 * (c�dulas) no qual o valor pode ser decomposto. As notas consideradas s�o de
		 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas
		 * necess�rias.
		 * 
		 * Entrada O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).
		 * 
		 * Sa�da Imprima o valor lido e, em seguida, a quantidade m�nima de notas de
		 * cada tipo necess�rias, conforme o exemplo fornecido. N�o esque�a de imprimir
		 * o fim de linha ap�s cada linha, caso ontr�rio seu programa apresentar� a
		 * mensagem: �Presentation Error�.
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
