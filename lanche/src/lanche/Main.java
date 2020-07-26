package lanche;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade 
//		deste item. A seguir, calcule e mostre o valor da conta a pagar.
		
//		
//		Entrada
//		O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade 
//		de um item conforme tabela acima.
//
//		Saída
//		O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 
//		casas após o ponto decimal.
		
//		Exemplo de Entrada	Exemplo de Saída
//		3 2		Total: R$ 10.00
//
//		4 3		Total: R$ 6.00
//
//		2 3		Total: R$ 13.50
//		
		Scanner sc = new Scanner(System.in);
		
		int codigo_lanche, qtd_item;
		double valor_compra;
		
		System.out.println("1    cachoro quente 4.00%n");
		System.out.println("2    x salada       5.50%n");
		System.out.println("3    x bacon        7.00%n");
		System.out.println("4    coca cola      3.00%n");
		System.out.println("5    guarana        2.50%n");
		
		System.out.println("digite o codigo do lanche /n");
		codigo_lanche = sc.nextInt();		
		
		System.out.println("digite a quantidade /n");
		qtd_item = sc.nextInt();
		
		switch(codigo_lanche) {
		case 1:
			valor_compra = 4 * qtd_item;
			System.out.printf("total: %.2f %n", valor_compra);
			break;
		case 2:
			valor_compra = 5.5 * qtd_item;
			System.out.printf("total: %.2f %n", valor_compra);
			break;
		case 3:
			valor_compra = 7 * qtd_item;
			System.out.printf("total: %.2f %n", valor_compra);
			break;
		case 4:
			valor_compra = 3 * qtd_item;
			System.out.printf("total: %.2f %n", valor_compra);
			break;
		default:
			valor_compra = 2.5 * qtd_item;
			System.out.printf("total: %.2f %n", valor_compra);
			break;
		}
		 
	
	}

}
