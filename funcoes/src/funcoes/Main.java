package funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l1, l2, l3;

		l1 = sc.nextInt();
		l2 = sc.nextInt();
		l3 = sc.nextInt();

		int maior = maior_de_tres_num(l1, l2, l3);
		mostreResultado(maior);

		sc.close();

	}

	public static int maior_de_tres_num(int x, int y, int z) {
		int auxiliar;
		if (x < y && x < z) {
			auxiliar = x;

		} else {
			if (y < x && y < z) {
				auxiliar = y;
			} else {
				auxiliar = z;
			}
			return auxiliar;

		}
		return auxiliar;
	}

	public static void mostreResultado(int valor) { // void pq ela nao retorna nada que eu posso usar no programa.
		System.out.println("maoir = " + valor);

	}

}
