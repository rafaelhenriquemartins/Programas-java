import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char repetir;
		
		

		do {
			System.out.println("graus"); 
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
	
			System.out.println(F);
			
			System.out.println("digite s para sair ou qualquer letra para continuar"); 
			repetir = sc.next().charAt(0);
			
		} while (repetir != 's');
		System.out.println("terminou");
	}

}
