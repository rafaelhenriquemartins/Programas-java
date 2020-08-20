import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite valor de N");
		N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("posição de " + i + " e posição de " + j);
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");

			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					System.out.println(mat[i][j]);
				}
			}
		}
	}

}
