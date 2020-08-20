package curso;

import java.util.Scanner;
import entidade.tringulo;
import impressao.imprimir;
import verificar.verifica;

public class aplicacao {

	public static void main(String[] args) {
		verifica verificar;
		verificar = new verifica();
		
		tringulo x, y;
		x = new tringulo();
		y = new tringulo();

		imprimir imprime;
		imprime = new imprimir();

		Scanner sc = new Scanner(System.in);

		System.out.println("entre com tres valores X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("entre com tres valores y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();
		double areay = y.area();

		imprime.imprimir(areax, areay);
		
		verificar.verifica(areax, areay);
		sc.close();

	}

}
