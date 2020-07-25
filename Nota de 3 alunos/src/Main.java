import java.util.Scanner;

public class Main {


			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				double nota_1 = 0, nota_2 = 0, nota_final;
				
				nota_1 = sc.nextDouble();
				nota_2 = sc.nextDouble();
				
				nota_final = nota_1 + nota_2;
				
				if (nota_final < 60.0) {
					System.out.println("REPROVADO");
				}
				else {
					System.out.println("APROVADO");
				}

	}

}
