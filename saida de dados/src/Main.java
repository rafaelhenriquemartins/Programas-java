import java.util.Locale;
import java.util.Scanner;

public class Main {

//SAIDA DE DADOS

	public static void main(String[] args) {
		System.out.print("Hello Word!");
		System.out.println("vai que vai");

		int y = 32;
		System.out.println(y);

		double x = 10.32223444;
		System.out.println(x);

		System.out.printf("%.2f %n", x);

		Locale.setDefault(Locale.US);
		System.out.printf("%.2f %n", x); // imprime com o separador ponto

		System.out.printf("numero int: " + y + "  e numero double: " + x);

		String nome = "Maria";
		System.out.printf("%n seu nome é %s e sua idade é de %d ", nome, y);

//PROCESSAMENTO DE DADOS CASTING
		int a = 5, b = 2;
		double total;

		total = (double) a / b;
		System.out.printf("%nresultado %f%n", total);

//ENTRADA DE DADOS
		Scanner sc = new Scanner(System.in);
		String nome1;
		String sobrenome;
		int idade = 0;
		double d = 0;

		System.out.println("Digite seu nome: ");
		nome1 = sc.next();// palavra sera armazenada

		System.out.println("Digite seu Sobrenome: ");
		sobrenome = sc.next();
		System.out.printf("seu nome é %s %s ", nome1, sobrenome);

		System.out.println("Digite um int: ");
		idade = sc.nextInt(); // para numeros inteiros
		System.out.printf("sua idade %d ", idade);

		System.out.println(" Digite um double: ");
		d = sc.nextDouble();
		System.out.printf("sua idade %.2f ", d);

		//System.out.printf("seu nome é %s %s sua idade %d salario %2.f ", nome1, sobrenome, idade, d);

// lendo um texto ate digitar ENTER
		
		String s1,s2,s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.printf(s1, s2, s3);
		System.out.printf(s1, s2, s3);
		sc.close();

		
		
	}

}
