package Project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrdrStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Scanner sc = new Scanner(System.in);
		// Exemplos de instancias
		//Product p = new Product("TV", 1000.0); E OrderItem oi1 = new OrderItem(1, 1000.0,p); OU
		OrderItem oi1 = new OrderItem(1, 1000.0, new Product("TV", 2000.0));
		// consigo acessar o Product apartir do OrderItem
		System.out.println(oi1.getQuantity());
		System.out.println(oi1.getPrice());
		//Pra que eu pegue o nome a classe Product tem que ter o ToString OU 
		// consigo imprimir o nome do produto associado ao OrderItem
		System.out.println(oi1.getProduct().getName());
		System.out.println(oi1.getProduct().getPrice());
		//chmando o toString dentro do OrederItem
		System.out.println(oi1);
		//testando a classe Cliente
		//Mesmo eu tendo o SDF na classe Client onde eu for usa-lo preciso instanciar ele
		//para passar adata nao esqueça que noa é format e sim parse
		Client c = new Client("rafael", "rafael@hotmail", sdf.parse("10/12/1986"));
		System.out.println(c);
		
		
		System.out.println(" Name: ");
		String name = sc.nextLine();
		System.out.println(" Email: ");
		String email = sc.nextLine();
		System.out.println(" Birth Date: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("ENTER ORDER DATA: ");
		System.out.println("Status: ");
		OrdrStatus orderStatus = OrdrStatus.valueOf(sc.next());// essa funcao convr=erte o valor digitedo para o valor que esta em orderstatus
		
		Order order = new Order(new Date(), orderStatus, client);
		
		System.out.println("How many items to this order? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println(" Item " + i);
			System.out.println("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.println("produc price: ");
			double priceProduct = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(nameProduct, priceProduct);
			OrderItem it = new OrderItem(quantity, priceProduct, product);
			//crie na memoria um objeto orderitem associado a um objeto produto
			
			//adicionando o orderitem dentro da lista pedido
			order.addItem(it);
		}
					
	    System.out.println();
	    System.out.println(order);
	}

}
