import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
		 * de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
		 * ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
		 * no final do mês, com duas casas decimais.
		 * 
		 * Entrada O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2
		 * valores de dupla precisão (double) com duas casas decimais, representando o
		 * salário fixo do vendedor e montante total das vendas efetuadas por este
		 * vendedor, respectivamente.
		 * 
		 * Saída Imprima o total que o funcionário deverá receber, conforme exemplo
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
