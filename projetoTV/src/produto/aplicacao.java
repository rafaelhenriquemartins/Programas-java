package produto;

import java.util.Scanner;

import projetoTV.Product;

public class aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		System.out.println("entre com os dados");
		System.out.println("name: ");
		produto.name = sc.next();
		System.out.println("price: ");
		produto.price = sc.nextDouble();
		System.out.println("quantity: ");
		produto.quantity = sc.nextInt();
		
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
