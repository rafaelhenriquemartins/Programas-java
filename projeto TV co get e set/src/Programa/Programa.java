package Programa;

import java.util.Scanner;
import Produto.Produto;
public class Programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com os dados");
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("price: ");
		double price = sc.nextDouble();
		System.out.println("quantity: ");
		int quantity = sc.nextInt();
		
		Produto produto = new Produto(name,price,quantity);
		
		produto.setName("Computador");
		System.out.println("atualizado: "+ produto.getName());
		
		produto.setPrice(999.99);
		System.out.println("Novo preço: " + produto.getPrice());
		
		produto.setQuantity(99);
		System.out.println(" Nova quantidade: " + produto.getQuantity());
		
		
		System.out.println(" Item " + produto);
		System.out.println();

		System.out.println(" digite o numero de produtos para ser atualizado no estoque");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		System.out.println();
		System.out.println(" atualizacao de estoque " + produto);
		System.out.println();
		System.out.println(" digite o numero de produtos para ser retirado do estoque");
		int qtd_remover = sc.nextInt();
		produto.removeProducts(qtd_remover);
		System.out.println();
		System.out.println(" atualizacao de estoque " + produto);

		sc.close();

	}

}
