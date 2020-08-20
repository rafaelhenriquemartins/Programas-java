package matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L, i = 0;
		int C, j = 0;
		L = sc.nextInt();
		C = sc.nextInt();
		int[][] matriz = new int[L][C];

		for (i = 0; i < L; i++) {
			for (j = 0; j < C; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < L; i++) {
			for (j = 0; j < C; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
