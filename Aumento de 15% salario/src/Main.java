import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total
		 * de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor
		 * ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber
		 * no final do m�s, com duas casas decimais.
		 * 
		 * Entrada O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2
		 * valores de dupla precis�o (double) com duas casas decimais, representando o
		 * sal�rio fixo do vendedor e montante total das vendas efetuadas por este
		 * vendedor, respectivamente.
		 * 
		 * Sa�da Imprima o total que o funcion�rio dever� receber, conforme exemplo
		 * fornecido.
		 */

		String nome_vendedor;
		double salario_vendedor, vendas, total_salario_vendedor;

		System.out.println("nome");
		nome_vendedor = sc.next();
		System.out.println("salario");
		salario_vendedor = sc.nextDouble();
		System.out.println("venda em dinheiro");
		vendas = sc.nextDouble();

		total_salario_vendedor = salario_vendedor + (vendas * 0.15);
		System.out.printf("nome: %s %n salario: %.2f %n ", nome_vendedor, total_salario_vendedor);

	}

}
