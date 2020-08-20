import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int N;
		N = sc.nextInt();

		int[][] matriz = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();

			}
		}
		System.out.println("diagonal principal");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
				}
				if (matriz[i][j] < 0) {
					cont += 1;
				}

			}
		}
		System.out.println();
		System.out.println("quantidade de negativos " + cont);
	}

}
