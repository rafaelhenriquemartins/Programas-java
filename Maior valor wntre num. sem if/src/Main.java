import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que leia três valores e apresente o maior dos três valores
		 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
		 * 
		 * 
		 * 
		 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
		 * segundo passo, portanto é necessário para chegar no resultado esperado.
		 * 
		 * Entrada O arquivo de entrada contém três valores inteiros.
		 * 
		 * Saída Imprima o maior dos três valores seguido por um espaço e a mensagem
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
