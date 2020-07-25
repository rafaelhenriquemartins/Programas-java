import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double largura = 0;
		double comprimento = 0;
		
		System.out.println(" Digite a largura: ");
		largura = sc.nextDouble();
		System.out.println(" Digite o comprimento: ");
		comprimento = sc.nextDouble();
		double total = comprimento * largura;
		
		System.out.printf("area total do terreno é %.2f", total);
		

	}

}
