import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de
		 * Bhaskara. Se n�o for poss�vel calcular as ra�zes, mostre a mensagem
		 * correspondente �Impossivel calcular�, caso haja uma divis�o por 0 ou raiz de
		 * numero negativo.
		 * 
		 * Entrada Leia tr�s valores de ponto flutuante (double) A, B e C.
		 * 
		 * Sa�da Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem
		 * "Impossivel calcular". Caso contr�rio, imprima o resultado das ra�zes com 5
		 * d�gitos ap�s o ponto, com uma mensagem correspondente conforme exemplo
		 * abaixo. Imprima sempre o final de linha ap�s cada mensagem.
		 */

		double a, b, c, delta;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4.0 * a * c;

		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);

			System.out.printf("r1: %.5f --  r2: %.5f", r1, r2);
		}
	}
	
}
