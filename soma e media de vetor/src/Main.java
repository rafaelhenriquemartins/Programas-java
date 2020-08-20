import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int soma = 0;

		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			vetor [i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.println("todos numeros " + vetor[i]);
			soma = soma + vetor[i];
		}
		System.out.printf("media: %d", soma);
		System.out.printf("media: %d", soma/n);
	}

}
