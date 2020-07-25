import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores
		 * lidos seguido da mensagem �eh o maior�. Utilize a f�rmula:
		 * 
		 * 
		 * 
		 * Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). Um
		 * segundo passo, portanto � necess�rio para chegar no resultado esperado.
		 * 
		 * Entrada O arquivo de entrada cont�m tr�s valores inteiros.
		 * 
		 * Sa�da Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem
		 * "eh o maior".
		 */

		int valor_1, valor_2, valor_3,maior;
		
		valor_1 = sc.nextInt();
		valor_2 = sc.nextInt();
		valor_3 = sc.nextInt();
		
		maior = (valor_1 + valor_2+Math.abs(valor_1 - valor_2))/2;
		
		maior = (maior + valor_3 + Math.abs(maior - valor_3))/2;
		
		System.out.println(maior);

	}

}
